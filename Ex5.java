import java.util.Scanner;

public class Ex5 {
	public static void main(String args[]) {
		final double pi = 3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Coloque o diametro da esfera: ");

		double diametro = scanner.nextInt(); 

		System.out.println("O volume da esfera é: " + (4 * pi * (diametro / 2) * (diametro / 2) * (diametro / 2)  ) / 3);
	} 
}