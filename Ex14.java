import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		final double pi = 3.14;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Coloque a aresta do cubo: ");
		double aresta = scanner.nextDouble();
		final double areaCubo = aresta * aresta * aresta;

		System.out.print("Coloque o raio da esfera: ");
		double raio = scanner.nextDouble();
		final double areaEsfera = (4 * pi * raio * raio * raio) / 3;

		System.out.println("A área livre é: " + (areaCubo - areaEsfera));
	} 
}