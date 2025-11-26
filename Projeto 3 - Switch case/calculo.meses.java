package aulaSwitchCas;

import java.util.Scanner;

public class prjMeses {
	public static void main(String [] args ) {
	    Scanner ler = new Scanner(System.in);
		int uDigitoPlaca;

		uDigitoPlaca = ler.nextInt();
		
		switch(uDigitoPlaca) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("tem 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("tem 30 dias");
			break;
		case 2: System.out.println("tem 28 dias");
		
		default:
			System.out.println("mes invalido");
		
		}
		
 ler.close();
	}

}
