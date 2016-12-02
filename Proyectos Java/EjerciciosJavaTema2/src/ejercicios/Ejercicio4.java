package ejercicios;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(args[0]);
		int primero = 1, segundo = 0, actual;
		System.out.println("------------Serie de Fibonacci------------");
		for (int i = 0; i < numero; i++) {
			actual = primero + segundo;
			primero = segundo;
			segundo = actual;
			System.out.print(actual + ", ");
		}
		
	}

}
