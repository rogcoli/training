package conta;

public abstract class Conta implements Comparable<Conta> {

	private int numeroConta;
	private String nome;
	private double saldo;
	private double limite;

	// construtor
	public Conta(String nome) {
		this.nome = nome;
	}

	public Conta(String nome, double limite) {
		super(); // dispensavel, eclipse bota como padrao
		this.nome = nome;
		this.limite = limite;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	/**
	 * Retorna o saldo remanescente apos o saque
	 * 
	 * @param valor
	 */
	public double sacar(double valor) {

		if (valor < saldo || valor < limite) {
			saldo -= valor;

			return saldo;
		}

		return 0;
	}

	/**
	 * Retorna o saldo remanescente apos o saque
	 * 
	 * @param valor
	 */
	public double depositar(double valor) {

		// System.out.println("Depositando");

		// TODO validar entrada

		saldo += valor;
		return saldo;
	}

	public String verDados() {
		return "Conta [numeroConta=" + numeroConta + ", nome=" + nome + ", saldo=" + saldo + ", limite=" + limite + "]";
	}

	public void verSaldo() {
		System.out.println("O saldo de " + nome + " eh : " + getSaldo());
	}
	
	public abstract void getTipoConta();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
}
