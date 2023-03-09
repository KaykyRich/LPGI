import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Coloque o valor do primeiro produto: ");
		double prod1 = scanner.nextDouble();

		System.out.print("Coloque o valor do segundo produto: ");
		double prod2 = scanner.nextDouble();

		System.out.print("Coloque o valor do terceiro produto: ");
		double prod3 = scanner.nextDouble();

		System.out.print("Coloque o valor do quarto produto: ");
		double prod4 = scanner.nextDouble();

		System.out.print("Coloque o valor do quinto produto: ");
		double prod5 = scanner.nextDouble();

		System.out.print("Coloque o valor pago: ");
		double valor = scanner.nextDouble();

		System.out.println("O valor do troco é: " + (((prod1 + prod2 + prod3 + prod4 + prod5) - valor) * -1));
	} 
}