package ejercicio2;

import java.util.ArrayList;

public class Principal {

	ArrayList<Viaje> lista;

	public Principal() {
		lista = new ArrayList<>();
	}

	public static void main(String[] args) {
		Principal main = new Principal();
		main.iniciar();
	}

	public void iniciar() {
		lista.add(new Viaje("Madrid", "Leon", 500));
		lista.add(new Viaje("Almeria", "Orense", 600));
		lista.add(new Viaje("Burgos", "Torrevieja", 700));
		lista.add(new Viaje("Torrelavega", "Avila", 200));
		lista.add(new Viaje("Griñon", "Albacete", 400));
		lista.add(new Viaje("Madrid", "Tokyo", 2563.74));
		lista.add(new Viaje("Paris", "Rennes", 489.35));
		lista.add(new Viaje("Bruselas", "Brujas", 597.11));
		lista.add(new Viaje("Londres", "Leeds", 563.96));
		lista.add(new Viaje("Tokyo", "Kyoto", 651.21));

		mostrar();

	}

	private void mostrar() {

		for (int i = 0; i < lista.size() - 1; i++) {
			Viaje viaje = lista.get(i).uneViaje(lista.get(i), lista.get(i + 1));
			System.out.println("Viaje nº" + (i + 1) + "\nUnion de: Viaje " + (i + 1) + " y Viaje " + (i + 2));
			System.out.println(
					"Origen: " + viaje.origen + "\nDestino: " + viaje.destino + "\nDistancia: " + viaje.distancia);
			System.out.println(
					"----------------------------------------------------------------------------------------------");
		}

	}

}
