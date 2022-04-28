package EX1_3;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public String retornarDados(){
        String txt;
        txt = "Nome: " +getNome()+ ", Cpf: "+getCpf()+", Sálario: "+getSalario();
        return txt;
    }
    
    public void aumentarSalario(double porcentagem){  
        double aux;
        aux = this.salario + ((this.salario * porcentagem)/100);
        setSalario(aux);
        System.out.println("Valor alterado com Sucesso!");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    
    
}
