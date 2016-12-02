package ejercicio3;

public class Vehiculo {

	private String matricula;
	private double kilometraje, precio;
	private boolean alquilado;

	public Vehiculo() {
		this.matricula = "";
		this.kilometraje = 0;
		this.precio = 0;
		this.alquilado = false;
	}

	public Vehiculo(String matricula, double kilometraje, double precio, boolean alquilado) {
		this.matricula = matricula;
		this.kilometraje = kilometraje;
		this.precio = precio;
		this.alquilado = alquilado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public boolean alquilar() {
		if (alquilado) {
			return false;
		}
		alquilado = true;
		return true;
	}

	public boolean terminarAlquiler() {
		if (!alquilado) {
			return false;
		}
		alquilado = false;
		return true;
	}

	public double calcularImporte(int extra) {
		return extra + precio * kilometraje;
	}

	public String consultarDatos() {
		String cad = (alquilado) ? "Si" : "No";
		return "\n\tMatricula: " + matricula + "\n\tKilometraje: " + kilometraje + "\n\tPrecio: " + precio
				+ "\n\tEn alquiler: " + cad;
	}

}
