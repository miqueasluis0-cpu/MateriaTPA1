import java.util.Scanner;

public class Fat {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int a[], b[], i, j, fatorial;
        a = new int[TAM];
        b = new int[TAM];

        System.out.println("Digite os valores:");
        for (i = 0; i < TAM; i++) {
            a[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {  
            fatorial = 1;            

            for (j = 2; j <= a[i]; j++) {
                fatorial *= j;
            }

            b[i] = fatorial;         
        }

        System.out.println("Os fatoriais são:");
        for (i = 0; i < TAM; i++) {
            System.out.println("F[" + a[i] + "] = " + b[i]);
        }

        ler.close();
    }
}
