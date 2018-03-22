package operadores;

public class Operadores {

	public static void main(String[] args) {
		
		int a = 1431655765;  // 01010101010101010101010101010101
		int b = -1431655766; // 10101010101010101010101010101010
		 
		System.out.print("a ->       ");
		System.out.println(Integer.toBinaryString(a)); // imprime a representação binária do número
		System.out.print("b ->       ");
		System.out.println(Integer.toBinaryString(b));
		 
		System.out.print("a << 3 ->  ");
		System.out.println(Integer.toBinaryString(a << 3)); // 10101010101010101010101010101000
		System.out.print("b << 3 ->  ");
		System.out.println(Integer.toBinaryString(b << 3)); // 01010101010101010101010101010000
		 
		System.out.print("a >>> 3 -> ");
		System.out.println(Integer.toBinaryString(a >>> 3)); // 00001010101010101010101010101010
		System.out.print("b >>> 3 -> ");
		System.out.println(Integer.toBinaryString(b >>> 3)); // 00010101010101010101010101010101
		 
		System.out.print("a >> 3 ->  ");
		System.out.println(Integer.toBinaryString(a >> 3)); // 00001010101010101010101010101010
		System.out.print("b >> 3 ->  ");
		System.out.println(Integer.toBinaryString(b >> 3)); // 11110101010101010101010101010101
		
	}

}
