package banco.model;


public class Conta {

	protected double saldo;
	protected EstadoDeUmaConta estadoAtual;
	
	public Conta( double saldo){
		this.saldo = saldo;
		estadoAtual = new SaldoPositivo();
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor){
		estadoAtual.deposita(this, valor);
	}
	
	public void saca(double valor){
		estadoAtual.saqua(this, valor);
	}
}
