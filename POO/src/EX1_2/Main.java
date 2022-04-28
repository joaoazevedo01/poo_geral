package EX1_2;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {

	        int sair, op, totalDeAulas;
	        String nome, titulacao;
	        double valorHoraAula, porcent;
	        sair = 0;
	                
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Digite o Nome: ");
	        nome = scan.next();
	        System.out.print("Digite a Titulação: ");
	        titulacao = scan.next();
	        System.out.print("Digite o valor da Hora/Aula: ");
	        valorHoraAula = scan.nextDouble();
	        System.out.print("Digite o valor do Total de Aulas: ");
	        totalDeAulas = scan.nextInt();
	        Professor p1 = new Professor(nome, titulacao, valorHoraAula, totalDeAulas);
	        
	        while (sair == 0){
	            System.out.println("Digite a opção desejada");
	            System.out.println("1 - Consultar dados");
	            System.out.println("2 - Ajustar Valor da Hora aula");
	            System.out.println("3 - Sair");
	            op = scan.nextInt();
	            if (op == 1){
	                System.out.println(p1.retornaDados());
	            }else if(op == 2){
	                System.out.print("Digite qual a porcentagem de aumento!: ");
	                porcent = scan.nextDouble();
	                p1.ajustaValorHoraAula(porcent);
	            }else if(op == 3){
	                sair = 1;
	                System.exit(0);
	            }else{
	                System.out.println("Opção inválida");
	            
	            }
	        }
	    }
	}
