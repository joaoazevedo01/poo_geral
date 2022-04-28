package PROVA_PARCIAL;

public class Reserva implements Pagamento{
	
	private Cliente cliente;
	private boolean pagamentoAVista;
	
	public Reserva(Cliente cliente, boolean pagamentoAVista) {
		this.cliente = cliente;
		this.pagamentoAVista = pagamentoAVista;
	}
	
	public double calcularPagamento() {
		double valorDaReserva = 3200;
		if (pagamentoAVista) {
			return (valorDaReserva/100)*90;
		}
		else {
			return valorDaReserva;
		}
	}
	
	public String toString() {
		String tipoDePagamento;
		if (this.pagamentoAVista) {
			tipoDePagamento = "Pagamento à Vista";
		}
		else {
			tipoDePagamento = "Pagamento Parcelado";
		}
		return this.cliente.getTipo()+" | "+this.cliente.getNome()+" | "+tipoDePagamento;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public String getTipoDePagamento() {
		if (pagamentoAVista) {
			return "Pagamento à Vista";
		}
		else {
			return "Pagamento Parcelado";
		}
	}
	
}
