package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double salarioAnual = Double.parseDouble(args[0]);
		int numeroHijos = Integer.parseInt(args[1]);
		double impuesto = (salarioAnual*15)/100;
		if(numeroHijos==0){
			System.out.println("El impuesto sobre la renta es de: " + impuesto);
		}else if(numeroHijos < 3 && numeroHijos > 0){
			System.out.println("El impuesto sobre la renta con "+numeroHijos+" hijos, es de: " + (impuesto-(impuesto*5)/100));
		}else{
			System.out.println("El impuesto sobre la renta con "+numeroHijos+" hijos, es de: " + (impuesto-(impuesto*15)/100));
		}
		
	}
	
}
