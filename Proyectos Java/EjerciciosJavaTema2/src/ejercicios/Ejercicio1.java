package ejercicios;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		//Años bisiestos
		try{
			int año = Integer.valueOf(args[0]);
			if((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
				System.out.println("El año " + año + " es bisiesto.");
			}else{
				System.out.println("El año " + año + " no es bisiesto.");
			}
		}catch(NumberFormatException e){
			System.out.println("Has introducido un valor incorrecto.");
		}
		
	}

}
