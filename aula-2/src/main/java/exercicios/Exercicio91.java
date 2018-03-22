package exercicios;

import java.util.Scanner;

public class Exercicio91 {

	private static final int TAMANHO_VALIDO = 4;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero de 4 algarismos:");

		String input = sc.nextLine();

		if (!isValid(input) && isNumeroValido()) {
			System.out.println("Valor inválido!");
		}

		System.out.println(getReverseInt(Integer.valueOf(input)));
		System.out.println();

	}

	public static int getReverseInt(int value) {
		int resultNumber = 0;
		
		for (int i = value; i != 0; i /= 10) {
			resultNumber = resultNumber * 10 + i % 10;
		}
		return resultNumber;
	}

	private static boolean isValid(String input) {
		return input != null && input.length() == TAMANHO_VALIDO;
	}

	// TODO implementar
	private static boolean isNumeroValido() {
		return true;
	}

}
