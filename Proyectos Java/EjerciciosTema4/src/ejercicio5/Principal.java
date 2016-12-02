package ejercicio5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Principal {

	ArrayList<Coche> lista;

	public static void main(String[] args) {
		Principal main = new Principal();
		main.menu();
	}

	public Principal() {
		lista = new ArrayList<>();
		lista.add(new Coche("654arg", "Toyota", "Prius", 100));
		lista.add(new Coche("32rt2", "Toyota", "Avensis", 50));
		lista.add(new Coche("54651sr", "Seat", "600", 30));
		lista.add(new Coche("6561v", "Skoda", "Octavia", 150));
		lista.add(new Coche("ee5130", "Audi", "TT", 200));
	}

	public void menu() {

		while (true) {
			System.out.println("Elige una de las siguientes opciones por su numero: ");
			System.out.println("1. Mostrar todos los coches introducidos.");
			System.out.println("2. Mostrar todos los coches de una marca determinada.");
			System.out.println("3. Mostrar todos los coches con menos de ciertos kilometros.");
			System.out.println("4. Mostrar el coche con más kilometros.");
			System.out.println("5. Mostrar los coches ordenados por kilometros de menor a mayor.");
			System.out.println("0. Salir.");
			int opcion = pedirOpcion();
			switch (opcion) {
			case 1:
				mostrarTodosLosCoches();
				break;
			case 2:
				mostrarDeMarca();
				break;
			case 3:
				mostrarConCiertosKm();
				break;
			case 4:
				mostrarMayorKm();
				break;
			case 5:
				mostrarOrdenadosPorKm();
				break;
			case 0:
				System.out.println("Gracias por utilizar mi programa.");
				System.exit(0);
				break;
			}
		}

	}

	@SuppressWarnings("unchecked")
	private void mostrarOrdenadosPorKm() {

		ArrayList<Coche> aux = (ArrayList<Coche>) lista.clone();
		int[] posiciones = new int[lista.size()];
		int posicion = -1;
		for (int i = 0; i < lista.size(); i++) {
			double min = 201;
			Coche car = null;
			for (Coche coche : aux) {
				if (coche.getKilometros() < min) {
					min = coche.getKilometros();
					posicion = lista.indexOf(coche);
					car = coche;
				}
			}
			posiciones[i] = posicion;
			aux.remove(car);
			posicion = -1;
		}
		for (int i = 0; i < posiciones.length; i++) {
			System.out.println(lista.get(posiciones[i]).toString());
		}

	}

	private void mostrarMayorKm() {

		double km = 0;
		int indice = -1;
		for (Coche coche : lista) {
			if (coche.getKilometros() > km) {
				km = coche.getKilometros();
				indice = lista.indexOf(coche);
			}
		}
		if (indice != -1) {
			System.out.println(lista.get(indice).toString());
		} else {
			System.out.println("No se pudo encontrar ningun coche con esas caracteristicas.");
		}

	}

	private void mostrarConCiertosKm() {

		double km = Integer.parseInt(pedirDatos("Introduce los Km maximos que puede tener el coche.", 2));
		for (Coche coche : lista) {
			if (coche.getKilometros() <= km) {
				System.out.println(coche.toString());
			}
		}

	}

	private void mostrarDeMarca() {

		String marca = pedirDatos("Introduce la marca por la que quieres buscar.", 1);
		for (Coche coche : lista) {
			if (coche.getMarca().equals(marca)) {
				System.out.println(coche.toString());
			}
		}

	}

	private void mostrarTodosLosCoches() {

		for (Coche coche : lista) {
			System.out.println(coche.toString());
		}

	}

	private int pedirOpcion() {

		int num = 0;
		try {
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			menu();
		}
		return num;
	}

	private String pedirDatos(String mensaje, int opcion) {
		String valor = "";
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println(mensaje);
				valor = sc.nextLine();
				switch (opcion) {
				case 1:
					return valor;
				case 2:
					Integer.parseInt(valor);
					return valor;
				}

			} catch (Exception e) {
				System.out.println("Escriba un valor correcto.");
			}
		} while (true);
	}

}
