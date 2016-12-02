package ejercicio3;

import java.util.ArrayList;

public class Principal {

	ArrayList<Triangulo> lista;

	public Principal() {
		lista = new ArrayList<>();
	}

	public static void main(String[] args) {
		Principal main = new Principal();
		main.iniciar();
	}

	public void iniciar() {
		lista.add(new Triangulo(5, 7));
		lista.add(new Triangulo(3, 9));
		lista.add(new Triangulo(5, 3));
		lista.add(new Triangulo(10, 8));
		lista.add(new Triangulo(4, 6));
		lista.add(new Triangulo(7, 7));
		lista.add(new Triangulo(9, 7));
		mostrar();

	}

	private void mostrar() {
		System.out.println("El triangulo con el area mas grande es el nº" + areaMasGrande());
		System.out.println("El triangulo con el perimetro mas pequeño es el nº" + perimetroMasPequeño());
		System.out.println("Mostrando el primer triangulo: " + lista.get(0).toString());
		System.out.println("Mostrando la lista de todos los triangulos.");
		for (Triangulo triangulo : lista) {
			System.out.println(triangulo.toString());
		}
	}

	private int perimetroMasPequeño() {
		int perimetro = 0;
		for (int i = 0; i < lista.size() - 1; i++) {
			if (lista.get(i).calcularPerimetro() > lista.get(i + 1).calcularPerimetro()) {
				perimetro = i + 1;
			} else {
				perimetro = i;
			}
		}
		return perimetro;
	}

	private int areaMasGrande() {
		int area = 0;
		for (int i = 0; i < lista.size() - 1; i++) {
			if (lista.get(i).calcularArea() > lista.get(i + 1).calcularArea()) {
				area = i;
			} else {
				area = i + 1;
			}
		}
		return area;
	}

}
