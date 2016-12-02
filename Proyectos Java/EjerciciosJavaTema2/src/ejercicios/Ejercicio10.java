package ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < n; j++) {
				if (j * i == n) {
					System.out.print(j + "*" + i + ", ");
				}
			}
		}

	}

}
