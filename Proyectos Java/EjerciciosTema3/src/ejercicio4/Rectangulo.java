package ejercicio4;

public class Rectangulo {

	@SuppressWarnings("unused")
	private Punto supIzq, supDer, infDer, infIzq;
	private int base, altura;

	public Rectangulo(Punto supIzq, Punto supDer, Punto infDer) {
		this.supIzq = supIzq;
		this.supDer = supDer;
		this.infDer = infDer;
		this.infIzq = new Punto(0, 0);
		this.base = infDer.x - infIzq.x;
		this.altura = supIzq.y - infIzq.y;
	}

	public Rectangulo(Punto supIzq, Punto supDer, Punto infDer, Punto infIzq) {
		this.supIzq = supIzq;
		this.supDer = supDer;
		this.infDer = infDer;
		this.infIzq = infIzq;
		this.base = infDer.x - infIzq.x;
		this.altura = supIzq.y - infIzq.y;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea() {

		return this.base * this.altura;

	}

	public void escribir() {

		for (int i = 0; i < this.altura; i++) {
			System.out.print("\n* ");
			for (int j = 0; j < this.base; j++) {
				if (i == 0 || i == this.altura - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("*");
		}

	}

}
