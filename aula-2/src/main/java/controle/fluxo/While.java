package controle.fluxo;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um nome...");

		while (true) {

			String input = sc.nextLine();

			if ("q".equals(input)) {
				System.out.println("Fechou");
				break;
			}

			char[] inputAsCharArray = input.toCharArray();
			
			
			int i = 0;
			
			while(i < inputAsCharArray.length) {
				
				System.out.println(inputAsCharArray[i]);
				
				i++;
			}
				

			

		}
	}
}
