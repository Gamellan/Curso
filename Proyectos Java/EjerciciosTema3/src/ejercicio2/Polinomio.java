package ejercicio2;

public class Polinomio {

	private int num1, num2, num3;

	public Polinomio(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public double calcularValor(double x) {
		return (this.num1 + (this.num2 * x) + (this.num3 * Math.pow(x, 2)));
	}

	public void escribir() {
		System.out.println(this.num1 + " + " + this.num2 + "x + " + this.num1 + "xe2 = 0");
	}

}
