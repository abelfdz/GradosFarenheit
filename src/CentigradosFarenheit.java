import java.util.Scanner;

public class CentigradosFarenheit {

	public static void main(String[] args) {
		double grados, farenheit;

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta grados: ");

		grados = sc.nextDouble();

		farenheit = 32 + (9 * grados / 5);

		System.out.println("La temperatura en Farenheit es: " + farenheit);
	}

}
