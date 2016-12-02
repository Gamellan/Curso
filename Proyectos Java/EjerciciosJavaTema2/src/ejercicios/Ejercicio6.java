package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {

		double n = Double.parseDouble(args[0]), factorial = 1;
		System.out.print("El factorial de " + n + " es: ");
		while (n != 0) {
			factorial *= n;
			n--;
		}
		System.out.println(factorial);

	}

}
