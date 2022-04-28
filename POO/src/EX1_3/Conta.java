package EX1_3;

public class Conta {

    protected int numero;
    protected double saldo;
    protected double limite;
    
    public Conta(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public void sacar(double valor){
    
        if(this.saldo < valor){
            System.out.println("Voçê não tem saldo suficiente!!");
        }else{
            this.saldo = this.saldo - valor;
        }
    }
    
    public void depositar(double valor){
    
        if(valor < 0){
            System.out.println("Voçê não pode Depositar um valor menor que 0!!");
        }else{
            this.saldo = this.saldo + valor;
        }
    }
    
    public double consultarSaldo(){
        return getSaldo();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}

