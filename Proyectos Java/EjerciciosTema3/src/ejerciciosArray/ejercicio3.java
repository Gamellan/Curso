package ejerciciosArray;

import java.util.Scanner;

public class ejercicio3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		boolean error = true;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Introduzca un numero del 1 al 10: ");
				int num = sc.nextInt();
				System.out.println("\nEn la posicion que eligio se encuentra el valor: " + array[num-1]);
				error = false;
			} catch (Exception e) {
				System.out.println("Introduzca un numero del 1 al 10 por favor.");
			}
		} while (error);

	}

}
