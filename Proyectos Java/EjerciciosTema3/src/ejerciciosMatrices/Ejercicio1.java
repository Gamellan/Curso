package ejerciciosMatrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[][] matriz1 = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int[][] matriz2 = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int[][] matrizResultado = new int[4][4];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.println(matrizResultado[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
