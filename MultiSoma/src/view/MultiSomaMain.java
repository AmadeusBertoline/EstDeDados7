package view;

import controller.MultiSomaController;
import java.util.Scanner;

public class MultiSomaMain {

	public static void main(String[] args) {

		int a, b, res;

		MultiSomaController multi = new MultiSomaController();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor para a: ");
		a = scanner.nextInt();

		System.out.println("Digite o valor para b: ");
		b = scanner.nextInt();

		res = multi.SomaMulti(a, b);

		System.out.println("Produto: " + res);
		
		scanner.close();

	}

}
