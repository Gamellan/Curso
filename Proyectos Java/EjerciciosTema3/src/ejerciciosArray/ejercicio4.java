package ejerciciosArray;

import java.util.Scanner;

public class ejercicio4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		boolean error = true;
		int num = 0;

		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Introduzca el tamaño del array: ");
				num = sc.nextInt();
				if (num < 1) {
					System.out.println("Introduzca un numero positivo.");
				} else {
					error = false;
				}
			} catch (Exception e) {
				System.out.println("Introduzca un numero por favor.");
			}
		} while (error);

		int[] numerosAleatorios = new int[num];
		for (int i = 0; i < num; i++) {
			numerosAleatorios[i] = (int) (Math.random() * 300) + 1;
		}

		error = true;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("¿Que digito quieres que sea guardado? ");
				num = sc.nextInt();
				if (num < 1) {
					System.out.println("Introduzca un numero positivo.");
				} else {
					error = false;
				}
			} catch (Exception e) {
				System.out.println("Introduzca un numero por favor.");
			}
		} while (error);

		int aux = 0, cantidad = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			aux = numerosAleatorios[i] % 10;
			if (aux == num) {
				cantidad++;
			}
		}

		int[] numDigitos = new int[cantidad];
		System.out.println("Tamaño del array: " + cantidad);
		int x = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			aux = numerosAleatorios[i] % 10;
			if (aux == num) {
				numDigitos[x] = numerosAleatorios[i];
				x++;
			}
		}

		System.out
				.println("Mostrar arrays.\n--------------------------------------------------\nNumeros aleatorios:\n");
		for (int j = 0; j < numerosAleatorios.length; j++) {
			System.out.println(numerosAleatorios[j]);
		}

		System.out.println("\n--------------------------------------------------\nNumeros con el digito especificado:");
		for (int i = 0; i < numDigitos.length; i++) {
			System.out.println(numDigitos[i]);
		}

	}

}
