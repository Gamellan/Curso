package ejercicio2;

public class Programador extends Empleado {

	private int lineaDeCodigoPorHora;
	private String lenguajeDominante;

	public Programador() {
		super();
		this.lineaDeCodigoPorHora = 0;
		this.lenguajeDominante = "";
	}

	public Programador(String nombre, String nif, int edad, boolean casado, double salario, int lineaDeCodigoPorHora,
			String lengiajeDominante) {
		super(nombre, nif, edad, casado, salario);
		this.lineaDeCodigoPorHora = lineaDeCodigoPorHora;
		this.lenguajeDominante = lengiajeDominante;
	}

	@Override
	public String toString() {
		return super.toString()+"\n\tLinea de codigo por hora: " + lineaDeCodigoPorHora + "\n\tLenguaje dominante: " + lenguajeDominante;
	}

}
