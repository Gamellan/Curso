package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		int a�o = 0, mes = 0, dia = 0, a�o_siguiente, mes_siguiente, dia_siguiente;
		boolean bisiesto = false, error = false;
		try {
			a�o = Integer.valueOf(args[0]);
			mes = Integer.valueOf(args[1]);
			dia = Integer.valueOf(args[2]);
			if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
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
				a�o_siguiente = a�o + 1;
				mes_siguiente = 1;
			} else {
				a�o_siguiente = a�o;
			}
			System.out.println("Ma�ana ser�: " + dia_siguiente + "/" + mes_siguiente + "/" + a�o_siguiente);

		}

	}

}
