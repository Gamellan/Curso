package ejercicio4;

import java.util.Calendar;

public class Fecha {

	private int year, month, day;

	public Fecha() {
		Calendar calendario = Calendar.getInstance();
		this.year = calendario.get(Calendar.YEAR);
		this.month = calendario.get(Calendar.MONTH) + 1;
		this.day = calendario.get(Calendar.DAY_OF_MONTH);
	}
	
	public Fecha(String fecha){
		String[] datosFecha = fecha.split("/");
		this.year = Integer.parseInt(datosFecha[0]);
		this.month = Integer.parseInt(datosFecha[1]);
		this.day = Integer.parseInt(datosFecha[2]);
	}
	
	public Fecha(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	
}
