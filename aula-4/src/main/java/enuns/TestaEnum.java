package enuns;

public class TestaEnum {

	public static void main(String[] args) {
		
		
		for (Bebida bebida : Bebida.values()) {
			System.out.println(bebida);
		}
		
		Bebida b = Bebida.obter(10);
		System.out.println("--------------");
		System.out.println(b);
		
		
	}

}
