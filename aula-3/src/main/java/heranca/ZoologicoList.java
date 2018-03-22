package heranca;

import java.util.ArrayList;
import java.util.List;

public class ZoologicoList {
	
//	private static int TAMANHO_JAULA = 10;
//
//	private Animal[] jaulas = new Animal[TAMANHO_JAULA];


	private List<Animal> jaulas = new ArrayList<Animal>();

	public List<Animal> getJaulas() {
		return jaulas;
	}

	public void prender(Animal a) {
		jaulas.add(a);
	}

	public void tratar() {
		
		//for (int i = 0; i < jaulas.length; i++) {
			//Animal animal = jaulas[i];
		
		for (Animal animal : jaulas) {

			if (animal != null) {

				animal.emitesom();

				if (!(animal instanceof Preguica)) {
					animal.corre();
				}
			}
		}
	}

}
