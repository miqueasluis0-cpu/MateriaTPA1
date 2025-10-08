package exercicios;

import java.util;
import java.util.Scanner;

public class primeiroExercicio {
	public static void main (String args []) {
		
		Scanner in = new Scanner (System.in);
		double n1, n2, n3, n4, mi, ex, nm;
		
		System.out.println("Entre com a primeira nota:");
		n1= in.nextDouble();
		
		System.out.println("Entre com a segunda nota:");
		n2= in.nextDouble();

		System.out.println("Entre com a terceira nota:");
		n3= in.nextDouble();

		System.out.println("Entre com a quarta nota:");
		n4= in.nextDouble();
		
		mi= (n1+n2+n3+n4)/4;
		
		if(mi >= 7)
			System.out.println("Está aprovado");
		
		else
			if (mi <5)
				System.out.println("Está reprovado");
			else
				System.out.println("Está em exame, apresente aqui a nota do exame:");
				ex= in.nextDouble();
				
				nm = (mi+ex)/2;
						
				if (nm >=7)
					System.out.println("Está aprovado");
				else
					System.out.println("Está reprovado");
	}

}
