package banco.model;


public class SaldoPositivo implements EstadoDeUmaConta {

	@Override
	public void saqua(Conta conta, double valor) {
		conta.saldo -=  valor;
		if(conta.getSaldo() < 0) conta.estadoAtual = new SaldoNegativo();
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

}
