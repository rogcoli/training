package conta;

public class ContaCorrente extends Conta implements Tributavel {

	private static final double VALOR_IMPOSTO = 10.0;

	public ContaCorrente(String nome) {
		super(nome);
	}

	@Override
	public void getTipoConta() {
		System.out.println("Conta do tipo Corrente");
	}

	public double getValorimposto() {
		return VALOR_IMPOSTO;
	}

	/**
	 * Retorno o novo saldo após efetuar o débito
	 * 
	 * @param imposto
	 * @return
	 */
	public double debitarValorImposto(double imposto) {

		System.out.println("Debitando o valor do imposto" + imposto);

		sacar(getValorimposto());

		return getSaldo();
	}

	public int compareTo(Conta o) {

		if (this.getNome() == o.getNome()) {
			return 0;
		}
		return this.getNome().compareTo(o.getNome());
	}

	@Override
	public String toString() {
		return "ContaCorrente [verDados()=" + verDados() + "]";
	}

}
