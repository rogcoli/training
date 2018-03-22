package controle.fluxo;

public class WhileBreak {

	public static void main(String[] args) {

		System.out.println("While with break... ");
		
		int i = 0;
		
		while (true) {

			if (i == 100) {
				System.out.println("Saindo do programa");
				break;
			}
			++i;
			System.out.println(i);

		}
	}
}
