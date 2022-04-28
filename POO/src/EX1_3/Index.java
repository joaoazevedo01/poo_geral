package EX1_3;
import java.util.Scanner;
public class Index {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int aux,op;
        aux = 1;
        
       System.out.println("Digite o nome do Cliente!");
        String nomeCli = scan.next();
        System.out.println("Digite o cpf do Cliente!");
        String cpfCli = scan.next();
        /*----------------------------------------------------------------------*/
        System.out.println("Digite o número do Cartão de crédito!");
        int numCartao = scan.nextInt();
        System.out.println("Digite o total da fatura do Cartão de crédito!");
        double totalFatura = scan.nextDouble();
        /*----------------------------------------------------------------------*/
        System.out.println("Digite o numero da conta!");
        int numConta = scan.nextInt();
        System.out.println("Digite o saldo da conta!");
        double saldoConta = scan.nextDouble();
        System.out.println("Digite o limite da conta!");
        double limiteConta = scan.nextDouble();
        /*----------------------------------------------------------------------*/
        System.out.println("Digite o nome do funcionario!");
        String nomeFun = scan.next();
        System.out.println("Digite o cpf do Funcionario!");
        String cpfFun = scan.next();
        System.out.println("Digite o salario do fun!");
        double salariofun = scan.nextDouble();
        
        Cliente cli = new Cliente(nomeCli, cpfCli);
        CartaoDeCredito cc = new CartaoDeCredito(numCartao, totalFatura);
        Conta cnt = new Conta(numCartao, saldoConta, limiteConta);
        Funcionario fun = new Funcionario(nomeFun, cpfFun, salariofun); 
        
        while(aux == 1){
            System.out.println("Digite a opção desejada!");
            System.out.println("1 - Consultar Cliente");
            System.out.println("2 - Consultar Fatura");
            System.out.println("3 - Retornar dados Cartão");
            System.out.println("4 - Sacar");
            System.out.println("5 - Depositar");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Retornar dados Funcionário");
            System.out.println("8 - Aumentar Porcentagem Funcionario");

            op = scan.nextInt();
            if(op == 1){
                System.out.println(cli.retornaDados());
            }else if(op == 2){
                System.out.println(cc.consultarFatura());
            }else if(op == 3){
                System.out.println(cc.retornarDados());
            }else if(op == 4){
                System.out.println("Valor para Sacar!");
                double valor = scan.nextDouble();
                cnt.sacar(valor);
            }else if(op == 5){
                System.out.println("Valor para Depositar!");
                double valor = scan.nextDouble();
                cnt.depositar(valor);
            }else if(op == 6){
                System.out.println(cnt.consultarSaldo());
            }else if(op == 7){
                System.out.print(fun.retornarDados());
            }else if(op == 8){
                System.out.println("Valor % de aumento!");
                double valor = scan.nextDouble();
                fun.aumentarSalario(valor);
            }else if(op == 9){
                aux = 0;
            }else{
                System.out.println("Digite uma opção Válida");
            }
        }
    }
}
