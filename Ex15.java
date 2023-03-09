import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Coloque a cotação do dólar: ");
		double cotacao = scanner.nextDouble();

		System.out.print("Coloque uma quantidade de dólares: ");
		double qntDolares = scanner.nextDouble();

		System.out.println("Esses dólares se transferem para: " + (cotacao * qntDolares) + " reais");
	} 
}