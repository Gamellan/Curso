package ejercicio4;

public class Persona {

	private String dni, nombre, apellidos;
	private Fecha fechaNacimiento;
	private int telefono;

	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.fechaNacimiento = new Fecha();
		this.telefono = 0;
	}

	public Persona(String dni, String nombre, String apellidos, Fecha fechaNacimiento, int telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		Fecha fechaAct = new Fecha();
		int edad = fechaAct.getYear() - this.getFechaNacimiento().getYear();
		if (fechaAct.getMonth() - this.getFechaNacimiento().getMonth() < 0) {
			edad--;
		} else if (fechaAct.getMonth() - this.getFechaNacimiento().getMonth() == 0) {
			if (fechaAct.getDay() - this.getFechaNacimiento().getDay() < 0) {
				edad--;
			}
		}
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento.toString() + ", telefono=" + telefono + "]";
	}

}
