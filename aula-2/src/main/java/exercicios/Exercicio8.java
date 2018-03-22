package exercicios;

public class Exercicio8 {

	public static void main(String[] args) {

		int tamanho = 10;

		for (int i = 0; i < tamanho; i++) {

			for (int j = 0; j < tamanho; j++) {

				if (i == j) {
					continue;
				}
				System.out.println(String.format("Posiccao [%d][%d]", i, j));
			}
		}

	}

}
