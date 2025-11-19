import java.util.Scanner;

public class atividade5 {


	    public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);

	        final int TAM = 10;
	        int a[], nume, i, j;

	        a = new int[TAM];

	
	        for (i = 0; i < TAM; i++) {
	            System.out.println("Insira o " + (i+1) + "º elemento:");
	            a[i] = in.nextInt();
	        }

	        System.out.println();

	
	        for (i = 0; i < TAM; i++) {

	            nume = a[i]; 

	            System.out.print(nume + ": ");

	            for (j = 1; j <= nume; j++) {
	                if (nume % j == 0) {
	                    System.out.print(j + " ");
	                }
	            }

	            System.out.println("\n");
	        }

	        in.close();
	    }
	}
