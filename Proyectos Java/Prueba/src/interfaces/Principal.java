package interfaces;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(new Punto(0, 6), new Punto(12, 6), new Punto(12, 0), new Punto(0, 0));
		Rectangulo r2 = new Rectangulo(new Punto(0, 3), new Punto(2, 3), new Punto(2, 0));
		Racional rac1 = new Racional(2, 4);
		Racional rac2 = new Racional(4, 8);

		ArrayList<Imprimible> impresiones = new ArrayList<>();
		impresiones.add(r1);
		impresiones.add(rac1);
		impresiones.add(r2);
		impresiones.add(rac2);

		for (Imprimible imprimible : impresiones) {
			System.out.println();
			imprimible.imprimir();
		}

		ArrayList<Detallable> detalles = new ArrayList<>();
		detalles.add(r1);
		detalles.add(r2);
		detalles.add(new Punto(0, 6));
		detalles.add(new Punto(12, 6));
		detalles.add(new Punto(12, 0));
		detalles.add(new Punto(0, 0));
		
		for (Detallable detallable : detalles) {
			detallable.detallable();
		}

	}

}
