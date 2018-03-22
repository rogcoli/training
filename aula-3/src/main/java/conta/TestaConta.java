package conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaConta {

	private static final int VALOR_MOVIMENTACAO = 10;

	public static void main(String[] args) {
		
		int firstId = 1;

		Conta c1 = new ContaCorrente("COLI_1");

		c1.setLimite(1000);
		c1.setNumeroConta(firstId);
		//c1.setSaldo(1000); // faz sentido?

		c1.depositar(1000);
		
		c1.getTipoConta();

		c1.verSaldo();
		System.out.println(c1.verDados());

		System.out.println("-------");
		
		Conta c2 = new ContaPoupanca("COLI_2");

		c2.setLimite(1000);
		c2.setNumeroConta(++firstId);

		c2.depositar(1000);
		
		c2.getTipoConta();
		
		c2.verSaldo();
		System.out.println(c2.verDados());
		
		System.out.println("-------------\n Movimentacao \n ------------");
		
		c1.sacar(VALOR_MOVIMENTACAO);
		c2.depositar(VALOR_MOVIMENTACAO);
		
		c1.verSaldo();
		c2.verSaldo();
		
		
		System.out.println("-------------\n Interface \n ------------");
		
		ContaCorrente cc = new ContaCorrente("COLI_3");
		cc.depositar(1000.00);
		
		Tributavel tt = (Tributavel) cc;
		tt.getValorimposto();
		tt.debitarValorImposto(900);
		
		System.out.println("Saldo após o débito do imposto: " + cc.getSaldo());
		
		
		// equals e hashcode
		System.out.println("Equals");
		System.out.println(c1.equals(cc));
		
		
		System.out.println("-------------\n Comparable \n ------------");
		
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(cc);
		contas.add(c2);
		contas.add(c1);
		
		System.out.println("Antes ordenacao");
		System.out.println(contas);
		
		Collections.sort(contas);
		
		System.out.println("Depois ordenacao");
		System.out.println(contas);
		
		
		Collections.sort(contas, new Comparator<Conta>() {

			public int compare(Conta o1, Conta o2) {
				
				int conta1 = o1.getNumeroConta();
				int conta2 = o2.getNumeroConta();
				
				
				if(conta1 == conta2) {
					return 0;
				}
				//DESC
				return conta1 > conta2 ? -1 : 1;
			}
		});
		
		System.out.println("Depois pelo numero conta DESC");
		System.out.println(contas);
		
		
	}
}
