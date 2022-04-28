package PROVA_PARCIAL;

public class PessoaFisica extends Cliente {
	
	private String CPF;
	
	public PessoaFisica(String name, String CPF) {
		this.setNome(name);
		this.setTipo("Pessoa Fisica");
		this.CPF = CPF;
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.getNome()+" | CPF: "+this.CPF;
	}
	
	public String getCPF() {
		return CPF;
	}
	
}
