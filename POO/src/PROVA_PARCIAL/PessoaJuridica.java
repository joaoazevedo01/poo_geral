package PROVA_PARCIAL;

public class PessoaJuridica extends Cliente {
	
	private String CNPJ;
	
	public PessoaJuridica(String Nome, String CNPJ) {
		this.setNome(Nome);
		this.setTipo("Pessoa Jurídica");
		this.CNPJ = CNPJ;
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.getNome()+" | CNPJ: "+this.CNPJ;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	
}
