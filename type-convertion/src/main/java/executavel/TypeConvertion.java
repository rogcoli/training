package executavel;

public class TypeConvertion {
	
	public static void main(String[] args) {
		
		byte a = 1;
		System.out.println(a);
		
		short b = 2;
		System.out.println(b);
		//System.out.println((byte) a);
		
		int c = 3;
		System.out.println(c);
		
		long d = 4;
		System.out.println(d);
		
		float e = 5;
		System.out.println(e);
		
		double f = 6;
		System.out.println(f);
		
		char g ='a';
		System.out.println(g);
		
		int ascii = (int) g;
		System.out.println(ascii);
		
		char h = (char) ascii;
		System.out.println(h);
		
		float i = (float) 0.1; // 0.1f
		System.out.println(i);
		
		boolean j = false;
		System.out.println(j);
				
		verifyQuestion18();
	}
	
	/** 
	 * Does this code compile?
	 */
	private static void verifyQuestion18() {
		
		float x = 0.0f;
		int y = 5;
		long z;
		x = y + 3.3f;
		//x = x + z;
		
		System.out.println(x);
	}

}
