package ejemplos;

@SuppressWarnings("unused")
public class Circunferencia {

	private double x, y, radio;

	public Circunferencia() {
		x=0;
		y=0;
		radio=0;
	}

	public Circunferencia(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	public void ponRadio(double r) {
		radio = r;
	}

	public double longitud() {
		return 2 * Math.PI * radio;
	}

}
