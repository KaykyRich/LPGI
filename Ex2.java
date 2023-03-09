import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Coloque a aresta do quadrado: ");

		double aresta = scanner.nextDouble();

		System.out.println("A area do quadrado é: " + aresta * aresta);
	} 
}