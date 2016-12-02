package ejerciciosArray;

public class ejercicio7 {

	public static void main(String[] args) {

		String[] histograma = { "", "", "", "", "", "", "", "", "", "" };
		for (int i = 0; i < 100; i++) {
			int num = (int) Math.random() * 10;
			histograma[num] += "*";
		}
		for (int i = 0; i < histograma.length; i++) {
			System.out.println(i + 1 + ": " + histograma[i]);
		}

	}

}
