package executavel;

public class Vetor {

	public static void main(String[] args) {

		// uni
		
		int unidimensionalTamanho = 10;
		int[] unidimensional = new int[unidimensionalTamanho];
		
		System.out.println("Matriz Uni Dimensional");
		populateUni(unidimensional);
		readUni(unidimensional);
		
		// BI
		int biDimensionalTamanho = 10;
		int[][] biDimensional = new int[biDimensionalTamanho][biDimensionalTamanho];
		
		System.out.println("Matriz Uni Dimensional");
		populateBi(biDimensional);
		readBi(biDimensional);
		
	}

	private static void populateUni(int[] unidimensional) {
		for (int i = 0; i < unidimensional.length; i++) {
			unidimensional[i] = i;
		}
	}

	private static void readUni(int[] unidimensional) {
		
		if (unidimensional != null) {
			
			for (int i = 0; i < unidimensional.length; i++) {
				
				System.out.println(String.format("Posição %d, Valor %d", i, i));
			}
		}
	}
	
	private static void populateBi(int[][] biDimensional) {
		for (int i = 0; i < biDimensional.length; i++) {
			for (int j = 0; j < biDimensional[0].length; j++) {
				biDimensional[i][j] = i+j;
			}
		}
	}

	private static void readBi(int[][] biDimensional) {
		
		if (biDimensional != null) {
			
			for (int i = 0; i < biDimensional.length; i++) {
				
				for (int j = 0; j < biDimensional.length; j++) {
					System.out.println(String.format("Posição [%d][%d], Valor %d", i, j, biDimensional[i][j]));
				}
			}
		}
	}
}
