package prjUltimoBim;

import java.util.Scanner;

public class terceiroExercicio {
	
	public static void main(String[] args) {
		
		int i, b=0;
		
		System.out.println("Os numeros multiplos de 5 de 0 até 400 são:");
		
		for(i=0;i<401;i=i+5) {
			
			System.out.println(i+"+"+b+"=");
			b=i+b;
			
			System.out.println(b);
		}
		
		
	}
	


}
