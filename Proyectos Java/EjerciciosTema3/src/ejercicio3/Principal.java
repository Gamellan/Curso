package ejercicio3;

public class Principal {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(14, 14, 6);
		System.out.println("Primer circulo: ");
		c1.escribirResultados();
		System.out.println("Area: " + c1.calcularArea());
		System.out.println("Longitud: " + c1.calcularLogitud());
		System.out.println("---------------------------------------");
		Circulo c2 = new Circulo(4, 8, 7);
		System.out.println("Segundo circulo: ");
		c2.escribirResultados();
		System.out.println("Area: " + c2.calcularArea());
		System.out.println("Longitud: " + c2.calcularLogitud());
		System.out.println("---------------------------------------");

		Circulo c3 = new Circulo(20, 15, 9);
		System.out.println("Tercero circulo: ");
		c3.escribirResultados();
		System.out.println("Area: " + c3.calcularArea());
		System.out.println("Longitud: " + c3.calcularLogitud());
		System.out.println("---------------------------------------");

	}

}
