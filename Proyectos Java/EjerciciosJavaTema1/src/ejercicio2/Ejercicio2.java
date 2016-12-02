package ejercicio2;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		double gravedadTierra = 9.8;
		double gravedadLuna = (gravedadTierra * 17) / 100;
		System.out.println("Tu peso en la Tierra es: " + Double.parseDouble(args[0]) * gravedadTierra);
		System.out.println("Tu peso en la Luna es: " + Double.parseDouble(args[0]) * gravedadLuna);
		
	}
	
}
