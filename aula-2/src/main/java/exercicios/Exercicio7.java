package exercicios;

public class Exercicio7 {

	/**
	 * A pegadinha aqui é usar long ao invés de int
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int inicio = 1;
		int fim = 30;

		long par = 1;
		long impar = 0;

		for (int i = inicio; i < fim; i++) {

			if (i % 2 == 0) {

				par = par * i;

				System.out.println(String.format("Par  , # %d, multiplicacao: %d", i, par));
			} else {

				impar = impar + i;

				System.out.println(String.format("Impar, # %d, adicao: %d", i, impar));
			}
		}

	}

}
