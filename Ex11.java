import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		final double pi = 3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Coloque o diametro do circulo: ");

		double diametro = scanner.nextDouble();

		System.out.println("A area do circulo é: " + (pi * (diametro / 2) * (diametro / 2)));
	} 
}