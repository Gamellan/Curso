package ejercicios;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		//A�os bisiestos
		try{
			int a�o = Integer.valueOf(args[0]);
			if((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))){
				System.out.println("El a�o " + a�o + " es bisiesto.");
			}else{
				System.out.println("El a�o " + a�o + " no es bisiesto.");
			}
		}catch(NumberFormatException e){
			System.out.println("Has introducido un valor incorrecto.");
		}
		
	}

}
