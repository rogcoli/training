package controle.fluxo;

import java.util.Scanner;

public class ForEForEach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome...");

		//while (true) {

			String input = "coli";

			//if ("q".equals(input)) {
			//	System.out.println("Fechou");
			//	break;
			//}

			char[] inputAsCharArray = input.toCharArray();
			
			
			
			System.out.println("FOR");
			for (int i = 0; i < inputAsCharArray.length; i++) {
				System.out.println(inputAsCharArray[i]);
			}
			
			System.out.println("Enhaced FOR");
			for (char c : inputAsCharArray) {
				System.out.println(c);
			}
			
			
				

			

		//}
	}
}
