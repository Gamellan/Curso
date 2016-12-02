package ejercicio4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Principal {

	ArrayList<Persona> agenda;
	
	public static void main(String[] args) {
		Principal main = new Principal();
		main.menu();
	}

	public Principal() {
		agenda = new ArrayList<>();
		System.out.println("Bienvenido a mi Agenda.");
	}

	public void menu() {

		while (true) {
			System.out.println("Elige una de las siguientes opciones por su numero: ");
			System.out.println("1. Añadir Persona.");
			System.out.println("2. Borrar Persona.");
			System.out.println("3. Buscar Persona.");
			System.out.println("4. Mostrar Agenda.");
			System.out.println("5. Mostrar los que cumplen año en...");
			System.out.println("0. Salir.");
			int opcion = pedirOpcion();
			switch (opcion) {
			case 1:
				aniadirPersona();
				System.out.println("Persona añadida a la agenda.");
				break;
			case 2:
				borrarPersona();
				System.out.println("Persona eliminada correctamente.");
				break;
			case 3:
				buscarPersona();
				break;
			case 4:
				mostrarAgenda();
				break;
			case 5:
				cumplenAniosEn();
				break;
			case 0:
				System.out.println("Gracias por utilizar mi programa.");
				System.exit(0);
				break;
			}
		}

	}

	private void cumplenAniosEn() {

		int mes = Integer.parseInt(pedirDatos("Introduce el numero del mes en el que quieres buscar", 2));
		for (Persona persona : agenda) {
			if(persona.getFechaNacimiento().getMonth() == mes){
				System.out.println(persona.toString());
			}
		}

	}

	private void mostrarAgenda() {

		for (Persona persona : agenda) {
			System.out.println(persona.toString());
		}

	}

	private void buscarPersona() {

		boolean encontrado = false;
		String dni = pedirDatos("Introduce el DNI de la persona a borrar: ", 1);
		for (Persona persona : agenda) {
			if (comprobarDNI(dni)) {
				System.out.println(persona.toString());
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("La persona que buscas no se encuentra en la agenda.");
		}

	}

	private void borrarPersona() {

		String dni = pedirDatos("Introduce el DNI de la persona a borrar: ", 1);
		for (Persona persona : agenda) {
			if (comprobarDNI(dni)) {
				agenda.remove(persona);
				break;
			}
		}

	}

	private void aniadirPersona() {

		String dni = "";
		do {
			dni = pedirDatos("Introduce el DNI: ", 1);
		} while (comprobarDNI(dni));
		String nombre = pedirDatos("Introduce el nombre: ", 1);
		String apellidos = pedirDatos("Introduce los apellidos: ", 1);
		Fecha fecha = new Fecha(pedirDatos("Introduce la fecha en formato 'YYYY/MM/DD' y con numeros.", 3));
		int telefono = Integer.parseInt(pedirDatos("Introduce tu telefono. ", 2));
		agenda.add(new Persona(dni, nombre, apellidos, fecha, telefono));

	}

	private boolean comprobarDNI(String dni) {
		for (Persona persona : agenda) {
			if (persona.getDni().equals(dni)) {
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
				case 1:
					return valor;
				case 2:
					Integer.parseInt(valor);
					return valor;
				case 3:
					if (comprobarFecha(valor))
						return valor;
					break;
				}

			} catch (Exception e) {
				System.out.println("Escriba un valor correcto.");
			}
		} while (true);
	}

	private boolean comprobarFecha(String valor) throws Exception {

		String[] datos = valor.split("/");
		Integer.parseInt(datos[0]);
		Integer.parseInt(datos[1]);
		Integer.parseInt(datos[2]);
		return true;
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

}
