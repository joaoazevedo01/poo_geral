package EX1_1;

public class Paciente {

	//atributo ou variavel de instancia
	String nome;
	int idade;
	
	//metodo para calcular a frequencia maxima
	public int frequenciaMaxima() {
		return 220-idade;
	}
	
	//metodo para calcular e retornar a frequencia alvo
	public String frequenciaAlvo() {
		double min = frequenciaMaxima()* 0.5;
		double max = frequenciaMaxima() * 0.85;
		return min+" "+max;
	}
}