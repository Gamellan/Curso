package ejercicio3;

public class Coche extends Vehiculo {

	private boolean conExtras;

	public Coche() {
		this.conExtras = false;
	}

	public Coche(String matricula, double kilometraje, double precio, boolean alquilado, boolean conExtras) {
		super(matricula, kilometraje, precio, alquilado);
		this.conExtras = conExtras;
	}

	public boolean isConExtras() {
		return conExtras;
	}

	public void setConExtras(boolean conExtras) {
		this.conExtras = conExtras;
	}

	@Override
	public String toString() {
		String cad = (conExtras) ? "Si" : "No";
		return "Coche: " + super.consultarDatos() + "\n\tconExtras: " + cad;
	}

}
