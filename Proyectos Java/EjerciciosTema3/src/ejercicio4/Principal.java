package ejercicio4;

public class Principal {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(new Punto(0, 6), new Punto(12, 6), new Punto(12, 0), new Punto(0, 0));
		Rectangulo r2 = new Rectangulo(new Punto(0, 3), new Punto(2, 3), new Punto(2, 0));
		System.out.println("Primero rectangulo: ");
		r1.escribir();
		System.out.println("\nBase: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());
		System.out.println("El area es: " + r1.calcularArea());
		System.out.println("---------------------------------------------------");
		System.out.println("\n\nSegundo rectangulo: ");
		r2.escribir();
		System.out.println("\nBase: " + r2.getBase());
		System.out.println("Altura: " + r2.getAltura());
		System.out.println("El area es: " + r2.calcularArea());
		System.out.println("---------------------------------------------------");

		if (r1.calcularArea() != r2.calcularArea()) {
			if (r1.calcularArea() > r2.calcularArea()) {
				System.out.println("El primer rectangulo es mas grande.");
			} else {
				System.out.println("El segundo rectangulo es mas grande.");
			}
		} else {
			System.out.println("Los dos rectangulos son iguales.");
		}

	}

}
