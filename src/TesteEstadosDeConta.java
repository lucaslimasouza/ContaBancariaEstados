import banco.model.Conta;


public class TesteEstadosDeConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1000.0);
		
		conta.saca(1010.0);

		conta.deposita(1000.0);
		
		System.out.println(conta.getSaldo());

	}
}
