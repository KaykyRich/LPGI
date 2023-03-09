import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Coloque o ângulo em graus: ");
		double ang = scanner.nextDouble();
		ang = Math.toRadians(ang);

		System.out.println("Tangente: " + Math.tan(ang) + ", Seno: " + Math.sin(ang) + ", Cosseno: " + Math.cos(ang));
	} 
}