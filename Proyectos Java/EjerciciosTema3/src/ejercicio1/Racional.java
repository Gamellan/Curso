package ejercicio1;

public class Racional {

	private int numerador, denominador;

	public Racional() {
		numerador = 0;
		denominador = 1;
	}

	public Racional(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Racional suma(Racional r) {
		Racional resul = new Racional();
		resul.numerador = this.numerador * r.denominador + r.numerador * this.denominador;
		resul.denominador = this.denominador * r.denominador;
		return resul;
	}

	public Racional resta(Racional r) {
		Racional resul = new Racional();
		resul.numerador = this.numerador * r.denominador - r.numerador * this.denominador;
		resul.denominador = this.denominador * r.denominador;
		return resul;
	}

	public Racional multiplacion(Racional r) {
		Racional resul = new Racional();
		resul.numerador = this.numerador * r.numerador;
		resul.denominador = this.denominador * r.denominador;
		return resul;
	}

	public Racional division(Racional r) {
	     return new Racional(this.numerador*r.numerador, this.denominador*r.denominador);
	}

	public boolean comparacion(Racional r) {
		if (this.numerador == r.numerador || this.denominador == r.denominador) {
			return true;
		} else if ((this.numerador / this.denominador) == (r.numerador / r.denominador)) {
			return true;
		}
		return false;
	}

	public void escribir() {
		System.out.println(this.numerador + "/" + this.denominador);
	}

}
