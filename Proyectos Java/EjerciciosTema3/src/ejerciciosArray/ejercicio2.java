package ejerciciosArray;

public class ejercicio2 {

	public static void main(String[] args) {

		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

}
