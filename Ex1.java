import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Coloque a base do retangulo: ");

		double base = scanner.nextDouble();
		System.out.print("Coloque a altura do retangulo: ");
		double altura = scanner.nextDouble();

		System.out.println("A area do retangulo é: " + base * altura);
	} 
}