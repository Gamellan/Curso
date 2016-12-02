package ejercicio3;

public class Furgoneta extends Vehiculo {

	private int capacidadCarga;

	public Furgoneta() {
		super();
		this.capacidadCarga = 0;
	}

	public Furgoneta(String matricula, double kilometraje, double precio, boolean alquilado, int capacidadCarga) {
		super(matricula, kilometraje, precio, alquilado);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public String toString() {
		return "Furgoneta: " + super.consultarDatos() + "\n\tCapacidad de carga: " + capacidadCarga;
	}

}
