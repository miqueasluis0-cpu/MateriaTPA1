package listaExercicios;

import java.util.Scanner;

public class sextoExercicio {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.println("digite o valor 1");
		a = ler.nextInt();

		System.out.println("digite o valor 2");
		b = ler.nextInt();

		System.out.println("digite o valor 3");
		c = ler.nextInt();

		if (a <= b) {
			if (b <= c) {
				// a <= b <= c
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			} else if (a <= c) {
				// a <= c < b
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
			} else {
				// c < a <= b
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
		} else if (a <= c) {
			// b < a <= c
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		} else if (b <= c) {
			// b <= c < a
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		} else {
			// c < b < a
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		ler.close();
	}

}
