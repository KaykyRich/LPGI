import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor da resistencia do circuito: ");
		double resistencia = scanner.nextDouble();

		System.out.print("Digite o valor da corrente eletrica do circuito: ");
		double corrente = scanner.nextDouble();

		System.out.println("O valor da tensão é: " + corrente * resistencia);
	} 
}