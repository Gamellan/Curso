package ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		String cad = "*";
		for (int i = 0; i < n; i++) {
			System.out.println(cad);
			cad+="*";
		}
		
	}
	
}
