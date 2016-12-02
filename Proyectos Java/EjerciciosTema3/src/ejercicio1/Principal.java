package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Racional r1, r2, r3;
		r1 = new Racional(2,4);
		r2 = new Racional(4,8);
		System.out.println("Suma: ");
		r3 = r1.suma(r2);
		r3.escribir();
		System.out.println("Resta: ");
		r3 = r1.resta(r2);
		r3.escribir();
		System.out.println("Division: ");
		r3 = r1.multiplacion(r2);
		r3.escribir();
		System.out.println("Multiplicacion: ");
		r3 = r1.division(r2);
		r3.escribir();
		System.out.print("Comparacion: ");
		if(r1.comparacion(r2)){
			System.out.println("Son iguales.");
		}else{
			System.out.println("Son distintos.");
		}
		
	}

}
