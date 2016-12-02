package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double pies = Double.parseDouble(args[0]);
		System.out.println("Tu valor en pulgadas: " + pies * 12);
		System.out.println("Tu valor en yardas: " + pies * 0.33333);
		System.out.println("Tu valor en centimetros: " + pies * 30.48);
		System.out.println("Tu valor en metros: " + pies * 0.3048);
		
	}
	
}
