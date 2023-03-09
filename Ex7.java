import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coloque o primeiro valor: ");
		double num1 = scanner.nextDouble();

		System.out.print("Coloque o segundo valor: ");
		double num2 = scanner.nextDouble();

		System.out.println("A media geometrica dos valores é: " + (sqrt(num1 * num2)));
	} 
}