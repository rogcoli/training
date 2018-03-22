package heranca;

public class Zoologico {

	private static int TAMANHO_JAULA = 10;

	private Animal[] jaulas = new Animal[TAMANHO_JAULA];

	public Animal[] getJaulas() {
		return jaulas;
	}

	// TODO validar a posicao, pode dar indexoutofbounds
	public void prender(Animal a, int posicao) {
		
		jaulas[posicao] = a;
	}

	public void tratar() {

		for (int i = 0; i < jaulas.length; i++) {

			Animal animal = jaulas[i];

			if (animal != null) {

				animal.emitesom();

				if (!(animal instanceof Preguica)) {
					animal.corre();
				}
			}
		}
	}
}
