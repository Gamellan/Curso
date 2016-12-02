package ejerciciosArray;

import java.util.Scanner;

public class ejercicio5_DNI {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		boolean error = true;
		int num = 0, numero = 0;

		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Introduzca el numero de su DNI: ");
				num = sc.nextInt();
				if (num < 1 && num > 9999999) {
					System.out.println("Introduzca un numero correcto.");
				} else {
					error = false;
				}
			} catch (Exception e) {
				System.out.println("Introduzca un numero por favor.");
			}
		} while (error);
		numero = num % 23;
		System.out.println("Tu letra de DNI es: " + letrasDNI[numero]);
		
	}
	
}
