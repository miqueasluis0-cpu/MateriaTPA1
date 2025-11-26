package aulaSwitchCas;

import java.util.Scanner;

public class prjRodizioCarro {
	public static void main(String [] args ) {
	    Scanner ler = new Scanner(System.in);
		int uDigitoPlaca;

		uDigitoPlaca = ler.nextInt();
		
		switch(uDigitoPlaca) {
		
		case 1:
		case 2:
		System.out.println("segunda-feira");
		break;
		
		
		case 3:
		case 4:
		System.out.println("terça-feira");
		break;
		
		
		case 5:
		case 6:
		System.out.println("quarta-feira");
		break;
		
		
		case 7:
		case 8:
		System.out.println("quinta-feira");
		break;
		
		
		case 9:
		case 0:
		System.out.println("sexta-feira");
		break;
		
		
		default:
			System.out.println("dia invalido");
		
		}
		
 ler.close();
	}

}
