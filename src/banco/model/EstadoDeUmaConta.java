package banco.model;


public interface EstadoDeUmaConta {

	void saqua(Conta conta, double valor);
	void deposita(Conta conta, double valor);
}
