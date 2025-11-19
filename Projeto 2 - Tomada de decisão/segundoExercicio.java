package listaExercicios;

import java.util.Scanner;

public class segundoExercicio {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int distancia, capacidadeTanque, gastoMedio;

		System.out.println("Digite a distancia percorrida:");
		distancia = ler.nextInt();

		System.out.println("Digite a capacidade, em litros, do tanque de combustivel:");
		capacidadeTanque = ler.nextInt();

		gastoMedio = distancia / capacidadeTanque;
		if (gastoMedio >= 10) {
			System.out.println("É economico.");
		} else {
			System.out.println("não economico.");
		}
		System.out.println("o gasto médio do seu carro é: " + gastoMedio);

		ler.close();
	}
}
