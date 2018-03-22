package controle.fluxo;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome...");

		//while (true) {

			String input = "Paulo";

			//if ("q".equals(input)) {
			//	System.out.println("Fechou");
			//	break;
			//}

			char[] inputAsCharArray = input.toCharArray();

			int i = 0;

			System.out.println("Bloco While!");

			while (i < inputAsCharArray.length) {
				System.out.println(inputAsCharArray[i]);
				i++;
			}
			
			i = 0;
			

			System.out.println("Bloco DO While!");

			do {
				System.out.println(inputAsCharArray[i]);
				i++;
			} while (i < inputAsCharArray.length);

		//}
	}
}
