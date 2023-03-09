import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a temperatura em celsius: ");
		double celsius = scanner.nextDouble();

		System.out.println("O valor da temperatura em fahrenheit é: " + ((celsius*9)/5)+32 );
	} 
}