package ejercicio1;

import java.util.ArrayList;

public class Principal {

	ArrayList<Empleado> listaEmpleados;

	public Principal() {
		listaEmpleados = new ArrayList<>();
	}

	public static void main(String[] args) {

		Principal main = new Principal();
		main.añadirEmpleado(new Empleado("1111f", 1500, 200, 20, 16, 3));
		main.añadirEmpleado(new Empleado("2222t", 2500, 200, 15, 16, 2));
		main.añadirEmpleado(new Empleado("3333a", 1800, 200, 30, 16, 3));
		main.añadirEmpleado(new Empleado("4444g", 1600, 200, 25, 16, 2));
		main.mostrarTodosEmpleados();
		main.borrarEmpleado("2222");
		System.out.println("La media de hijos en la empresa es: " + main.mediaHijos());
		main.mostrarEmpleado("2222");
		main.mostrarEmpleado("1111");

	}

	public void añadirEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado);

	}

	public void borrarEmpleado(String nif) {
		Empleado empleado = buscarEmpleado(nif);
		if (empleado != null) {
			listaEmpleados.remove(listaEmpleados.indexOf(empleado));
		} else {
			System.out.println("Error, el empleado con el NIF " + nif + " no existe.");
		}
	}

	public Empleado buscarEmpleado(String nif) {
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getNif().equalsIgnoreCase(nif)) {
				return listaEmpleados.get(i);
			}
		}
		return null;
	}

	public double mediaHijos() {

		double contador = 0;
		for (int i = 0; i < listaEmpleados.size(); i++) {
			contador += listaEmpleados.get(i).getNumeroHijos();
		}
		return contador / listaEmpleados.size();

	}

	public void mostrarEmpleado(String nif) {
		Empleado empleado = buscarEmpleado(nif);
		if (empleado != null) {
			System.out.println(empleado.toString());
		} else {
			System.out.println("Error, el empleado con el NIF " + nif + " no existe.");
		}
	}

	public void mostrarTodosEmpleados() {
		for (int i = 0; i < listaEmpleados.size(); i++) {
			System.out.println("Empleado numero " + (i + 1) + "\n");
			System.out.println(listaEmpleados.get(i).toString());
			System.out.println("-------------------------------------------------------------\n");
		}
	}

}
