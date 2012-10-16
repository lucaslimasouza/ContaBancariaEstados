package banco.model;


public class SaldoNegativo implements EstadoDeUmaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Conta possui saldo negativo!!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		if(conta.getSaldo() >= 0) conta.estadoAtual = new SaldoPositivo();
	}



}
