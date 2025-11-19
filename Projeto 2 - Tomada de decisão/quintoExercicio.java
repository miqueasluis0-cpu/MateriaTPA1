package listaExercicios;

import java.util.Scanner;

public class quintoExercicio {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.println("Digite o valor 1 do possível triângulo:");
		a = ler.nextInt();

		System.out.println("Digite o valor 2 do possível triângulo:");
		b = ler.nextInt();

		System.out.println("Digite o valor 3 do possível triângulo:");
		c = ler.nextInt();

		if (a >= b + c) {
			System.out.println("Não é triângulo");
		} else if (b >= a + c) {
			System.out.println("Não é triângulo");
		} else if (c >= a + b) {
			System.out.println("Não é triângulo");
		} else {
			System.out.println("É um triângulo");

			if (a == b) {
				if (b == c) {
					System.out.println("Equilátero");
				} else {
					System.out.println("Isósceles");
				}
			} else if (a == c) {
				System.out.println("Isósceles");
			} else if (b == c) {
				System.out.println("Isósceles");
			} else {
				System.out.println("Escaleno");
			}
		}
		ler.close();
	}
}
