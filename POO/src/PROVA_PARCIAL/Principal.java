package PROVA_PARCIAL;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		int choice = 0;
		List<Reserva> reservas = new ArrayList<>();
		List<Reserva> listaDeEspera = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		while (choice != 6) {
			System.out.println("\nRestaurante SABOR SOFISTICADO");
			System.out.println("1. Reservar Mesa");
			System.out.println("2. Pesquisar Reserva");
			System.out.println("3. Imprimir Reservas");
			System.out.println("4. Imprimir Lista de Espera");
			System.out.println("5. Cancelar Reserva");
			System.out.println("6. Finalizar\n");
			choice = input.nextInt();
			input.nextLine();
			
			if (choice == 1) {
				boolean aVista;
				Cliente aux;
				System.out.println("Insira seu nome: ");
				String nome = input.nextLine();
				System.out.println("Deseja realizar o pagamento a vista? (s/n)");
				if (input.nextLine().contains("s")) {
					aVista = true;
				}
				else {
					aVista = false;
				}
				System.out.println("Deseja realizar a reserva como pessoa física? (s/n)");
				if (input.nextLine().contains("s")) {
					System.out.println("Insira seu CPF: ");
					String CPF = input.nextLine();
					aux = new PessoaFisica(nome, CPF);
				}
				else {
					System.out.println("Insira seu CNPJ: ");
					String CNPJ = input.nextLine();		
					aux = new PessoaJuridica(nome, CNPJ);
				}
				if (reservas.size() < 5) {
					reservas.add(new Reserva(aux, aVista));
					System.out.println("Reserva efetuada com sucesso!\n");
				}
				else {
					listaDeEspera.add(new Reserva(aux, aVista));
					System.out.println("Sem mesas disponíveis, sua reserva está na fila de espera na posição "+listaDeEspera.size()+".\n");
				}
			}
			
			else if (choice == 2) {
				System.out.println("Deseja realizar a pesquisa em nome de uma pessoa física? (s/n)");
				if (input.nextLine().contains("s")) {
					System.out.println("Insira seu CPF: ");
					String CPF = input.nextLine();
					if (find(reservas, "CPF", CPF) != null) {
						System.out.println("Encontramos sua reserva!");
					}
					else if (find(listaDeEspera, "CPF", CPF) != null) {
						System.out.println("Você está na posição "+listaDeEspera.indexOf(find(listaDeEspera, "CPF", CPF))+" da fila de espera!");
					}
					else {
						System.out.println("Não encontramos nenhum registro nesse CPF.");
					}
				}
				else {
					System.out.println("Insira seu CNPJ: ");
					String CNPJ = input.nextLine();		
					if (find(reservas, "CNPJ", CNPJ) != null) {
						System.out.println("Encontramos sua reserva!");
					}
					else if (find(listaDeEspera, "CNPJ", CNPJ) != null) {
						System.out.println("Você está na posição "+listaDeEspera.indexOf(find(listaDeEspera, "CNPJ", CNPJ))+" da fila de espera!");
					}
					else {
						System.out.println("Não encontramos nenhum registro nesse CNPJ.");
					}
				}
			}
			
			else if (choice == 3) {
				for (Reserva reserva : reservas) {
					System.out.println(reserva.getCliente().getTipo()+" | "+reserva.getCliente().getNome()+" | "+reserva.getTipoDePagamento());
				}
			}
			
			else if (choice == 4) {
				for (Reserva reserva : listaDeEspera) {
					System.out.println(reserva.getCliente().getTipo()+" | "+reserva.getCliente().getNome()+" | "+reserva.getTipoDePagamento()+" | Posição: "+(listaDeEspera.indexOf(reserva)+1));
				}
			}
			
			else if (choice == 5) {
				System.out.println("A reserva que deseja canelar está no nome de uma Pessoa Fisica? (s/n)");
				if (input.nextLine().contains("s")) {
					System.out.println("Insira seu CPF: ");
					String CPF = input.nextLine();
					if (find(reservas, "CPF", CPF) != null) {
						reservas.remove(find(reservas, "CPF", CPF));
						System.out.println("Reserva cancelada com sucesso!");
						reservas.add(listaDeEspera.get(0));
						listaDeEspera.remove(0);
					}
					else if (find(listaDeEspera, "CPF", CPF) != null) {
						listaDeEspera.remove(find(reservas, "CPF", CPF));
						System.out.println("Reserva removida da fila de espera com sucesso!");
					}
					else {
						System.out.println("Não encontramos nenhum registro nesse CPF.");
					}
				}
				else {
					System.out.println("Insira seu CNPJ: ");
					String CNPJ = input.nextLine();		
					if (find(reservas, "CNPJ", CNPJ) != null) {
						reservas.remove(find(reservas, "CPF", CNPJ));
						System.out.println("Reserva cancelada com sucesso!");
						reservas.add(listaDeEspera.get(0));
						listaDeEspera.remove(0);
					}
					else if (find(listaDeEspera, "CNPJ", CNPJ) != null) {
						listaDeEspera.remove(find(reservas, "CNPJ", CNPJ));
						System.out.println("Reserva removida da fila de espera com sucesso!");
					}
					else {
						System.out.println("Não encontramos nenhum registro nesse CNPJ.");
					}
				}
			}
		}
		input.close();
	}
	
	public static Reserva find(List<Reserva> reservas, String tipo, String id) {
		if (tipo == "CPF") {
			for (Reserva reserva : reservas) {
				if (reserva.getCliente() instanceof PessoaFisica) {
					if (((PessoaFisica)reserva.getCliente()).getCPF().equals(id)) {
						return reserva;
					}
				}
			}
		}
		else {
			for (Reserva reserva : reservas) {
				if (reserva.getCliente() instanceof PessoaJuridica) {
					if (((PessoaJuridica)reserva.getCliente()).getCNPJ().equals(id)) {
						return reserva;
					}
				}
			}
		}
		return null;
	}
}
