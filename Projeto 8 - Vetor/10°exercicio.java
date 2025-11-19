package prjAtividadeVetor;

import java.util.Scanner;

public class decimoExercicio {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int a[] = new int[TAM];
        int b[] = new int[TAM];
        int c[] = new int[TAM];
        int k = 0;

        System.out.println("Digite os valores de A: ");
        for (int i = 0; i < TAM; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Digite os valores de B: ");
        for (int i = 0; i < TAM; i++) {
            b[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            boolean existeEmB = false;

            for (int j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    existeEmB = true;
                    break;
                }
            }

            if (!existeEmB) {
                c[k] = a[i];
                k++;
            }
        }

        System.out.println("Valores de A que NÃO aparecem em B:");
        for (int i = 0; i < k; i++) {
            System.out.println(c[i]);
        }

        in.close();
    }
}