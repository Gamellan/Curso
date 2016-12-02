package ejercicio3;

public class Triangulo {

	private double base, altura;

	public Triangulo() {
		this.base = 0;
		this.altura = 0;
	}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularPerimetro() {
		return (2 * altura) * base;
	}

	public double calcularArea() {
		return (base * altura) / 2;
	}

	@Override
	public String toString() {
		return "base=" + base + ", altura=" + altura + ", area=" + calcularArea() + ", perimetro=" + calcularPerimetro();
	}

}
