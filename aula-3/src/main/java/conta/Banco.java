package conta;

public class Banco {

	public static void main(String[] args) {
		
		
		int firstId = 1;

		Conta c1 = new ContaCorrente("coli 1");

		c1.setLimite(1000);
		c1.setNumeroConta(firstId);
		c1.depositar(1000);
		c1.getTipoConta();
		c1.verSaldo();
		System.out.println(c1.verDados());
		System.out.println("-------");
		
		Conta c2 = new ContaPoupanca("coli 1");

		c2.setLimite(1000);
		c2.setNumeroConta(++firstId);
		c2.depositar(1000);
		c2.getTipoConta();
		c2.verSaldo();
		System.out.println(c2.verDados());
		
		
		
		
	}

}
