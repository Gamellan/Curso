package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]), suma = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				suma+= i;
			}
		}
		if (suma == n) {
			System.out.println(n + " es un número perfecto.");
		} else {
			System.out.println(n + " no es un número perfecto.");
		}

	}

}
