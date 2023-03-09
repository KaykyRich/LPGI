import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor em milhas maritmas: ");
		double milhas = scanner.nextDouble();

		System.out.println("O valor em quilometros é: " + milhas * 1.852);
	} 
}