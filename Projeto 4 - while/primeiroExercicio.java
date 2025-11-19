package prjLacoRepeticao;

import java.util.Scanner;

public class primeiroExercicio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int i=1, n, r;
		
		System.out.println("entre com o numero desejado:");
		
		n= ler.nextInt ();
		
		while (i<=10) {
			
			
			r=i*n;
			
			System.out.println("Resultado é:"+r);
			
			i++;
		}
		
		
		

	}

}
