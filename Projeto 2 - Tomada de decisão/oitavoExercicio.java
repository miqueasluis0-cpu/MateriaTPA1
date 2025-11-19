package listaExercicios;

import java.util.Scanner;

public class oitavoExercicio {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		double salario, aliquota, parc, IRPF;

		System.out.println("digite seu salario: ");
		salario = ler.nextInt();

		if (salario <= 1434.59) {
			aliquota = 0;
			parc = 0;
		} else if (salario <= 2150.00) {
			aliquota = 7.5;
			parc = 107.59;
		} else if (salario <= 2866.70) {
			aliquota = 15;
			parc = 268.84;
		} else if (salario <= 3582.00) {
			aliquota = 22.5;
			parc = 483.84;
		} else {
			aliquota = 27.5;
			parc = 662.91;
		}
		IRPF = (salario * aliquota / 100) - parc;
		System.out.println(IRPF);
		ler.close();
	}

}
