package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	/**
	 * Uso do if ao inves do switch para sair do laco
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		printWelcome();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("------------------------------\nDigite sua opcao: ");

			int input = sc.nextInt();

			if (input == 1) {

				test();

				fatorial(sc);

			} else if (input == 2) {

				raiz(sc);

			} else if (input == 3) {

				tabuada();

			} else {
				close(sc);
				break;
			}

		}

	}

	private static void test() {
		System.out.println("ola");
	}

	private static void close(Scanner sc) {
		System.out.println("Fechando o programa");
		sc.close();
	}

	private static void tabuada() {
		System.out.println("Imprimindo a tabuada de 1 a 10");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(String.format("%d X %d =%d", i, j, i * j));
			}
		}
	}

	private static void raiz(Scanner sc) {

		System.out.println("Informe 3 numeros separados por `,` para calular a raiz quadrada. Ex: 4,8,16");

		sc = new Scanner(System.in);

		String numeros = sc.nextLine();

		String[] numerosAsString = numeros.split(",");

		for (String value : numerosAsString) {
			Integer numero = Integer.valueOf(value);
			System.out.println(String.format("A raiz quadrada de %s eh %d", value,
					(numero / numero)));
		}
	}

	private static void fatorial(Scanner sc) {

		System.out.println("Informe um numero para calular seu fatorial");

		sc = new Scanner(System.in);
		int fatorial = sc.nextInt();

		int result = 1;

		for (int i = fatorial; i > 1; i--) {
			result *= i;
		}

		System.out.println(String.format("O fatorial de %d eh %d", fatorial, result));
	}

	private static void printWelcome() {

		System.out.println("1 - calcular o fatorial de um numero dado;");
		System.out.println("2 - calcular a raiz quadrada de 3 numeros dados;");
		System.out.println("3 - imprimir a tabuada completa de 1 a 10;");
		System.out.println("4 - sair do programa.");

	}

}
