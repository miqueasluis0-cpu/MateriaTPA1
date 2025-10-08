package listaExercicios;

import java.util.*;

public class primeiroExercicio {
	
	public static void main (String args []) {
		
		Scanner in = new Scanner (System.in);
		
		int anoAtual, anoNasc, idade;
		
		System.out.println("Digite seu ano de nascimento");
		anoNasc= in.nextInt();
		
		System.out.println("Digite seu ano atual");
		anoAtual= in.nextInt();
		
		idade= anoAtual-anoNasc;
				
				System.out.println("Sua idade é:"+ idade);
				
				if (idade<10)
					System.out.println("você é uma criança");
				
				else if (idade<=17)
					System.out.println("Você é um adolescente");
				
				else if (idade<=59)
					System.out.println("Você é um adulto");
				
				else 
					System.out.println("idoso");
					
	}

}
