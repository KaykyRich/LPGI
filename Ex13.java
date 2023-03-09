import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Coloque a velocidade inicial (m/s): ");
		double v0 = scanner.nextDouble();

		System.out.print("Coloque a aceleração (m/s2): ");
		double a = scanner.nextDouble();

		System.out.print("Coloque o tempo (s): ");
		double t = scanner.nextDouble();

		System.out.println("A velocidade final é: " + ((v0 + a * t) * 3.6) + "km/h");
	} 
}