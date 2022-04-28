package PROVA_PARCIAL;

public class Cliente {
	
	private String nome;
	private String tipo;
	
	public Cliente() {
		this.nome = "NOT FOUND";
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome: "+this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setTipo(String nome) {
		this.tipo = nome;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
