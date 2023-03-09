import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		final double pi = 3.14;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Coloque a altura da base do cone: ");
		double altura = scanner.nextDouble();

		System.out.print("Coloque o raio da base do cone: ");
		double raio = scanner.nextDouble();

		System.out.println("O volume do cone é: " + (pi * raio * raio * altura) / 3);
	} 
}