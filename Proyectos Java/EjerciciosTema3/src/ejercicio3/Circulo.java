package ejercicio3;

public class Circulo {

	private int x, y, radio;

	public Circulo() {
		this.x = 0;
		this.y = 0;
		this.radio = 0;
	}

	public Circulo(int radio) {
		this.x = 0;
		this.y = 0;
		this.radio = radio;
	}

	public Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	public double calcularLogitud() {
		return 2 * Math.PI * this.radio;
	}

	public void escribirResultados() {
		System.out.println("X: " + this.x + "\nY: " + this.y + "\nRadio: " + this.radio);
	}

}
