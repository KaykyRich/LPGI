import java.util.Scanner;

public class Ex6 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coloque o primeiro valor: ");
		double num1 = scanner.nextInt();

		System.out.print("Coloque o segundo valor: ");
		double num2 = scanner.nextInt();

		System.out.print("Coloque o terceiro valor: ");
		double num3 = scanner.nextInt();

		System.out.print("Coloque o terceiro valor: ");
		double num4 = scanner.nextInt();
		
		System.out.println("A media dos valores é: " + ((num1 + num2 + num3 + num4) / 4));
	} 
}