package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		int año = 0, mes = 0, dia = 0, año_siguiente, mes_siguiente, dia_siguiente;
		boolean bisiesto = false, error = false;
		try {
			año = Integer.valueOf(args[0]);
			mes = Integer.valueOf(args[1]);
			dia = Integer.valueOf(args[2]);
			if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
				bisiesto = true;
			}
		} catch (NumberFormatException e) {
			error = true;
			System.out.println("Has introducido un valor incorrecto.");
		}

		if (!error) {
			if ((dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || dia == 31
					|| (mes == 2 && (dia == 29 || (dia == 28 && !bisiesto)))) {
				dia_siguiente = 1;
				mes_siguiente = mes + 1;
			} else {
				dia_siguiente = dia + 1;
				mes_siguiente = mes;
			}
			if (mes_siguiente == 13) {
				año_siguiente = año + 1;
				mes_siguiente = 1;
			} else {
				año_siguiente = año;
			}
			System.out.println("Mañana será: " + dia_siguiente + "/" + mes_siguiente + "/" + año_siguiente);

		}

	}

}
