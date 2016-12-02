package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]), m = Integer.parseInt(args[1]), r = 0, mcd;
		do {
			r = n % m;
			if(r==0){
				mcd = m;
				System.out.println("Resto: " + r);
				System.out.println("Maximo comun divisor: " + mcd);
			}else{
				n = m;
				m = r;
				System.out.println("Resto: " + r);
			}
		} while (r != 0);

	}

}
