package prj15atividadesVetor;

import java.util.Scanner;

public class Ex11_buscar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
        int a[], i, x=0, achou = 0;

        final int TAM = 10;

        a = new int[TAM];
        
        for (i = 0; i<TAM; i++) {
        	System.out.println("A = ("+i+")");
        	a[i] = ler.nextInt();
        }
        System.out.println ("Digite o valor que você quer conferir.");
    	x = ler.nextInt();
        for (i = 0; i<TAM; i++) {
        	
        	achou = 0;
        	
        	if (a[i] == x) {
        		achou = 1;
        		i = TAM;
        	}
        }
        System.out.print("A = (");
        for (i = 0; i < TAM; i++) {
            System.out.print(a[i]);
            if (i < TAM - 1) System.out.print(", ");
        }
        System.out.println(")");
        if (achou == 1){
        	System.out.println("O número "+x+" está no vetor A");
        } else {
        	System.out.println("O número "+x+" não está no vetor A");
        }

	}

}
