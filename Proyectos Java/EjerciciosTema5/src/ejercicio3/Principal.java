package ejercicio3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings({ "unused", "resource" })
public class Principal {

	ArrayList<Vehiculo> lista;

	public static void main(String[] args) {
		Principal main = new Principal();
	}

	public Principal() {
		lista = new ArrayList<>();
		menu();
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

	public void menu() {

		while (true) {
			System.out.println("Elige una de las siguientes opciones por su numero: ");
			System.out.println("1. Dar de alta un vehiculo.");
			System.out.println("2. Alquilar un vehiculo.");
			System.out.println("3. Devolver un vehiculo.");
			System.out.println("4. Listar los vehiculos.");
			System.out.println("0. Salir.");
			int opcion = pedirOpcion();
			switch (opcion) {
			case 1:
				System.out.println("1. Dar de alta coche.");
				System.out.println("2. Dar de alta moto.");
				System.out.println("3. Dar de alta furgoneta.");
				System.out.println("0. Volver.");
				opcion = pedirOpcion();
				añadirVehiculo(opcion);
				break;
			case 2:
				System.out.println("1. Alquilar un coche.");
				System.out.println("2. Alquilar una moto.");
				System.out.println("3. Alquilar una furgoneta.");
				System.out.println("0. Volver.");
				opcion = pedirOpcion();
				alquilarVehiculo(opcion);
				break;
			case 3:
				if (devolverVehiculo()) {
					System.out.println("El vehiculo fue devuelto correctamente.");
				} else {
					System.out.println("El vehiculo no pudo ser devuelto.");
				}
				break;
			case 4:
				listarVehiculos(4);
				break;
			case 0:
				System.out.println("Gracias por utilizar mi programa.");
				System.exit(0);
				break;
			}
		}

	}

	private boolean devolverVehiculo() {

		String matricula = "";
		do {
			matricula = pedirDatos("Escriba la matricula de su vehiculo.", 1);
		} while (!comprobarMatricula(matricula));
		for (Vehiculo vehiculo : lista) {
			if (vehiculo.getMatricula().equals(matricula) && vehiculo.isAlquilado()) {
				mostrarImporte(lista.indexOf(vehiculo));
				lista.remove(vehiculo);
				return true;
			}

		}
		return false;

	}

	private void mostrarImporte(int indice) {

		System.out.println("--Importe a pagar--");
		if (lista.get(indice) instanceof Coche && ((Coche) lista.get(indice)).isConExtras()) {
			System.out.println(lista.get(indice).calcularImporte(20));
		} else if (lista.get(indice) instanceof Moto && ((Moto) lista.get(indice)).isConCasco()) {
			System.out.println(lista.get(indice).calcularImporte(10));
		} else {
			System.out.println(lista.get(indice).calcularImporte(0));
		}
	}

	private void alquilarVehiculo(int opcion) {

		listarVehiculos(opcion);
		System.out.println("Escriba el numero del vehiculo que quiere alquilar.");
		int i = pedirOpcion();
		lista.get(i - 1).setAlquilado(true);
		if (lista.get(i - 1) instanceof Coche) {
			((Coche) lista.get(i - 1)).setConExtras(
					Boolean.parseBoolean(pedirDatos("SI/NO: ¿Quiere el vehiculo con extras? Son 20€ adicionales.", 3)));
		} else if (lista.get(i - 1) instanceof Moto) {
			((Moto) lista.get(i - 1)).setConCasco((Boolean
					.parseBoolean(pedirDatos("SI/NO: ¿Quiere el vehiculo con extras? Son 20€ adicionales.", 3))));
		}
		System.out.println("Eligio: " + lista.get(i - 1).toString());

	}

	private void listarVehiculos(int opcion) {
		int i = 0;
		System.out.println("Lista de los vehiculos.");
		for (Vehiculo vehiculo : lista) {
			switch (opcion) {
			case 1:
				if (vehiculo instanceof Coche)
					System.out.println((i + 1) + ": " + vehiculo.toString());
				i++;
				break;
			case 2:
				if (vehiculo instanceof Moto)
					System.out.println((i + 1) + ": " + vehiculo.toString());
				i++;
				break;
			case 3:
				if (vehiculo instanceof Furgoneta)
					System.out.println((i + 1) + ": " + vehiculo.toString());
				i++;
				break;
			case 4:
				System.out.println((i + 1) + ": " + vehiculo.toString());
				i++;
				break;
			}
		}

	}

	private void añadirVehiculo(int opcion) {

		String matricula = "";
		boolean repetido = true;
		if (opcion != 0)
			do {
				matricula = pedirDatos("Escriba la matricula.", 1);
				repetido = (comprobarMatricula(matricula)) ? true : false;
			} while (repetido);
		switch (opcion) {
		case 1:
			lista.add(new Coche(matricula, 0.4, 0, false, false));
			break;
		case 2:
			lista.add(new Moto(matricula, 0.6, 0, false, false));
			break;
		case 3:
			int carga = Integer.parseInt(pedirDatos("Introduzca la capacidad de carga que puede soportar.", 2));
			lista.add(new Furgoneta(matricula, 0.5, 0, false, carga));
			break;
		}

	}

	private boolean comprobarMatricula(String matricula) {

		for (Vehiculo vehiculo : lista) {
			if (vehiculo.getMatricula().equals(matricula)) {
				return true;
			}
		}
		return false;
	}

	private String pedirDatos(String mensaje, int opcion) {
		String valor = "";
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println(mensaje);
				valor = sc.nextLine();
				switch (opcion) {
				case 2:
					Integer.parseInt(valor);
					break;
				case 3:
					if (valor.equalsIgnoreCase("SI"))
						valor = "true";
					else if (valor.equalsIgnoreCase("NO"))
						valor = "false";
					Boolean.parseBoolean(valor);
					break;
				}
				return valor;

			} catch (Exception e) {
				System.out.println("Escriba un valor correcto.");
			}
		} while (true);
	}

}
