package enuns;

public enum Bebida {

	CERVEJA(10), GUARANA(7), COCA(5);

	private int codigo;

	private Bebida(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public static Bebida obter(int codigo) {
		for (Bebida bebida : values()) {
			if (bebida.getCodigo() == codigo)
				return bebida;
		}
		return null;
	}

}
