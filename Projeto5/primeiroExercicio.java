package prj.faca.enquanto;

import java.util.Scanner;

public class primeiroExercicio {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int n, fat = 1;

		System.out.println("digite um número:");
		n = in.nextInt();
		
		int i=n;
		
		do {
			
			fat = i*fat;
			i--;
			
			}while (i>0);
		System.out.println(fat);
		in.close();
		
		
		

	}

}
