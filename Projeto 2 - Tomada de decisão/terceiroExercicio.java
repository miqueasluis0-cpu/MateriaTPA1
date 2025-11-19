package listaExercicios;

import java.util.Scanner;

public class terceiroExercicio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double peso, altura, imc;

		System.out.println("digite seu peso");
		peso = ler.nextDouble();

		System.out.println("digite sua altura em metros");
		altura = ler.nextDouble();
		imc = peso / (altura * altura);
		if (imc > 40) {
			System.out.println("obesidade nivel 3");
		} else if (imc > 35) {
			System.out.println("obesidade nivel 2");

		} else if (imc > 30) {
			System.out.println("obesidade nivel 1");

		} else if (imc > 25) {
			System.out.println("excesso de peso");

		} else if (imc > 18.5) {
			System.out.println("normal");

		} else
			System.out.println("excesso de magreza");
		System.out.println("seu IMC é: " + imc);
		ler.close();
	}

}
