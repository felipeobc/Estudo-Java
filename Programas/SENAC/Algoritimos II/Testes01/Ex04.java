
import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	/**
	 * Faça um programa que leia do teclado 3 números, ordene-os e imprima.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] numero = new int[3];

		System.out.println("Digite 3 números a cada ordem.");

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o " + i + "º" + " número.");
			numero[i] = ler.nextInt();
		}
		// System.out.println(Arrays.toString(numero));
		Arrays.sort(numero);
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i] + " < ");
		}
		ler.close();
	}

}
