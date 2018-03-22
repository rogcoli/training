package conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome) {
		super(nome);
	}

	@Override
	public void getTipoConta() {
		System.out.println("Conta do tipo Poupanca");

	}

	public int compareTo(Conta o) {

		if (this.getNome() == o.getNome()) {
			return 0;
		}
		return this.getNome().compareTo(o.getNome());
	}

	@Override
	public String toString() {
		return "ContaPoupanca [verDados()=" + verDados() + "]";
	}

}
