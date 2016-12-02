package ejercicio3;

public class Moto extends Vehiculo {

	private boolean conCasco;

	public Moto() {
		super();
		this.conCasco = false;
	}

	public Moto(String matricula, double kilometraje, double precio, boolean alquilado, boolean conCasco) {
		super(matricula, kilometraje, precio, alquilado);
		this.conCasco = conCasco;
	}

	public boolean isConCasco() {
		return conCasco;
	}

	public void setConCasco(boolean conCasco) {
		this.conCasco = conCasco;
	}

	@Override
	public String toString() {
		String cad = (conCasco) ? "Si" : "No";
		return "Moto: " + super.consultarDatos() + "\n\tconCasco: " + cad;
	}

}
