package paquete;

public class AsignacionVariables {

	int z=8;
	
	public static void main(String[] args) {
		final double PI = 3.1415926536;
		int a = 5, b = 0, c;
		b = a * 3; // Se cambia el valor de b a 15
		c = a; // Se guarda en c el valor de a que es 5
		a = a + 6; // Se suma 6 al valor que tenía a. Ahora vale 11
		b = a - c; // b guarda 11 - 5 que es 6
		System.out.println("La variable a contiene: " + a);
		System.out.println("La variable b contiene: " + b);
		System.out.println("La variable c contiene: " + c); 
		System.out.println("La constante PI contiene: " + PI); 

	}
	
	public void otroMetodo(){
		System.out.println("La variable z contiene: " + z);
	}

}
