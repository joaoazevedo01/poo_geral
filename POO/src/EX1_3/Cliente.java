package EX1_3;

public class Cliente{

    protected String nome;
    protected String cpf;
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String retornaDados(){
        String txt;
        txt = "Nome: " + getNome() + ", CPF: " + getCpf();
        return txt;
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

}
