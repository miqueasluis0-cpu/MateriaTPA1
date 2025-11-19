package prjUltimoBim;

import java.util.Scanner;

public class primeiroExercicio {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
	 int anoI, anoF,  anoB=0 , i=1, anos;
	 
	 System.out.println("Digite o primeiro ano:");
	 anoI = in.nextInt();
	 
	 i=anoI;
	 
	 System.out.println("Digite o Segundo ano:");
	 anoF = in.nextInt();
	 
	 while (i<=anoF) {
		 
		 i++;
		 
		 if (i%4 ==0){
			 
			 anos=i;
			 System.out.println("É ano bissexto:");
			 System.out.println(anos);
			 
			 anoB=anoB+1;
		 }
		 
	 }
	 System.out.println("O número de ano bissexteos é:"+anoB);
	 
	 
		 
	}

}
