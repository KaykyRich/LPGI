import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Coloque a diagonal do quadrado: ");

		double diagonal = scanner.nextDouble();

		System.out.println("A area do quadrado é: " + diagonal * diagonal / 2);
	} 
}