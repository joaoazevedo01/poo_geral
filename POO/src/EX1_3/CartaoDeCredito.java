package EX1_3;

public class CartaoDeCredito {
    
    protected int numero;
    protected double totalFatura;
    
    public CartaoDeCredito(int numero, double totalFatura) {
        this.numero = numero;
        this.totalFatura = totalFatura;
    }
    
    public double consultarFatura(){
        return getTotalFatura();
    }
    
    public String retornarDados(){
        String txt;
        txt = "Número da conta: " + getNumero() + ", Fatura: " +getTotalFatura();
        return txt;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getTotalFatura() {
        return totalFatura;
    }

    public void setTotalFatura(double totalFatura) {
        this.totalFatura = totalFatura;
    }
    

    
    
    
}

