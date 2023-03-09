import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Coloque a base do triangulo: ");

		double base = scanner.nextDouble();
		System.out.print("Coloque a altura do triangulo: "); 
		double altura = scanner.nextDouble();

		System.out.println("A area do triangulo é: " + base * altura / 2);
	} 
}