package EX1_1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Paciente p = new Paciente();
		
		System.out.println("nome: ");
        p.nome = teclado.nextLine();
        System.out.println("idade: ");
        p.idade = teclado.nextInt();
        
        System.out.println("Frequencia maxima -> "+p.frequenciaMaxima());
        System.out.println("Frequencia alvo -> "+p.frequenciaAlvo());
        
        teclado.close();
	}

}
