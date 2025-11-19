package listaExercicios;

import java.util.Scanner;

public class setimoExercicio {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int nota_um, nota_dois, media, nota_exame, mediaExame;

		System.out.println("Digite sua nota 1: ");
		nota_um = ler.nextInt();

		System.out.println("Digite sua nota 2: ");
		nota_dois = ler.nextInt();

		media = (nota_um + nota_dois) / 2;

		if (media >= 6) {
			System.out.println("aprovado" + " sua media é: " + media);
		} else if (media < 3) {
			System.out.println("reprovado" + " sua media é: " + media);
		} else
			System.out.println("sua media é: " + media + ", você está em exame, envie outra nota:");
		nota_exame = ler.nextInt();
		mediaExame = (nota_um + nota_dois + nota_exame) / 3;
		if (mediaExame >= 6) {
			System.out.println("aprovado" + " sua nova media é: " + mediaExame);
		} else {
			System.out.println("reprovado" + " sua nova media é: " + mediaExame);
		}
		ler.close();
	}

}
