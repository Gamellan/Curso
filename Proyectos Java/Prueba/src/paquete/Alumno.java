package paquete;

public class Alumno {

	String nombre = "Alumno 1";
	char grupo = 'A';

	char devolvergrupo() {
		return grupo;
	}

	void cambiargrupo(char nuevogrupo) {
		grupo = nuevogrupo;
	}

	void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Grupo: " + devolvergrupo());
	}

}
