package ejercicio2;

public class Principal {

	public static void main(String[] args) {

		Polinomio p1 = new Polinomio(6, 3, 5);
		Polinomio p2 = new Polinomio(8, 12, 5);
		System.out.println("Primero polinomio: ");
		p1.escribir();
		System.out.println("Siendo x=5: " + p1.calcularValor(5));
		System.out.println("-------------------------------------------------------------");
		System.out.println("Segundo polinomio: ");
		p2.escribir();
		System.out.println("Siendo x=15: " + p2.calcularValor(15));

	}

}
