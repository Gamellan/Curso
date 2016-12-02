package ejercicio2;

public class Empleado {

	private String nombre, nif;
	private int edad;
	private boolean casado;
	private double salario;
	
	public Empleado() {
		this.nombre = "";
		this.nif = "";
		this.edad = 0;
		this.casado = false;
		this.salario = 0;
	}

	public Empleado(String nombre, String nif, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.nif = nif;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public String rangoEdad(){
		String cad = "";
		if(edad<22){
			cad = "Principiante";
		}else if(edad<36){
			cad = "Intermedio";
		}else{
			cad = "Senior";
		}
		return cad;
	}
	
	public void aumentarSalario(double porcentaje){
		salario += ((salario*porcentaje)/100);
	}

	@Override
	public String toString() {
		return nombre + ":\n\tNIF: " + nif + "\n\tEdad: " + edad + "\n\tCasado: " + casado + "\n\tSalario: "
				+ salario;
	}
	
}
