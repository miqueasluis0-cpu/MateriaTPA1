package listaExercicios;

import java.util.Scanner;

public class quintoExercicio {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.println("Digite o valor 1 do poss�vel tri�ngulo:");
		a = ler.nextInt();

		System.out.println("Digite o valor 2 do poss�vel tri�ngulo:");
		b = ler.nextInt();

		System.out.println("Digite o valor 3 do poss�vel tri�ngulo:");
		c = ler.nextInt();

		if (a >= b + c) {
			System.out.println("N�o � tri�ngulo");
		} else if (b >= a + c) {
			System.out.println("N�o � tri�ngulo");
		} else if (c >= a + b) {
			System.out.println("N�o � tri�ngulo");
		} else {
			System.out.println("� um tri�ngulo");

			if (a == b) {
				if (b == c) {
					System.out.println("Equil�tero");
				} else {
					System.out.println("Is�sceles");
				}
			} else if (a == c) {
				System.out.println("Is�sceles");
			} else if (b == c) {
				System.out.println("Is�sceles");
			} else {
				System.out.println("Escaleno");
			}
		}
		ler.close();
	}
}
