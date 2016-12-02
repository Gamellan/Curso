package ejerciciosMatrices;

public class Ejercicio3 {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, 5, 6, 7, 18 }, { 0, 2, 3, 4, 5, 6, 7, 8 },
				{ 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 2, 3, 4, -5, 6, 7, 8 } };
		int mayor = -5000, menor = 5000;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > mayor) {
					mayor = matriz[i][j];
				} else if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);

	}

}
