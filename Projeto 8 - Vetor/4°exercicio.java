import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int a[], i, j;

        a = new int[TAM];

        
        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i+1) + "º elemento:");
            a[i] = in.nextInt();
        }

        System.out.println();
        
        for (i = 0; i < TAM; i++) {

            System.out.print(a[i] + ": ");

            for ( j = 0; j <= a[i]; j =j+2 ) {
            	{
                    System.out.print(j + " ");
            	}
            }

            System.out.println("\n");
    }

    }
    


}
