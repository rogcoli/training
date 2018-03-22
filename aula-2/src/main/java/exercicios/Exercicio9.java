package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	private static final int TAMANHO_VALIDO = 4;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero de 4 algarismos:");

		String input = sc.nextLine();

		if (!isValid(input) && isNumeroValido()) {
			System.out.println("Valor inválido!");
		}
		
		char[] inputAsArray = input.toCharArray();
		
		System.out.println("Seu numero invertido é ");
		
		for (int i = inputAsArray.length; i > 0 ; i--) {
			System.out.print(i);
		}
		System.out.println();

	}

	private static boolean isValid(String input) {
		return input != null && input.length() == TAMANHO_VALIDO;
	}

	// TODO implementar
	private static boolean isNumeroValido() {
		return true;
	}

}
