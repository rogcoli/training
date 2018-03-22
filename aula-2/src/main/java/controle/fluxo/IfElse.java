package controle.fluxo;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número...");

		while (true) {

			String input = sc.nextLine();

			if ("q".equals(input)) {
				System.out.println("Fechou");
				break;
			}

			int inputAsInt = Integer.parseInt(input);

			if (inputAsInt % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
		}
	}
}
