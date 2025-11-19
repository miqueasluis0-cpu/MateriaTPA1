package prjAtividadeVetor;

import java.util.Scanner;

public class decimoSegundoExercicio {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a[] = new int [10], s, i;
		boolean usado[] = new boolean [10];
		
		for (i=0; i<10; i++) {
			a[i] = (int)(Math.random()*100);
			usado[i] = true;
		}
		
		System.out.println("Essas são as senhas para a retirada do lanche: ");
		for (i=0; i<10; i++) {
			System.out.println(a[i]);
		}
		
		while(true) {
			System.out.println("Digite uma das senhas: ");
			s = in.nextInt();
			
			boolean existe = false;
			for (i=0; i<10; i++) {
				if(s == a[i]) {
					existe = true;
					
					if(usado[i] == true) {
						System.out.println("Senha usada com sucesso");
						usado[i] = false;
					} else {
						System.out.println("Senha já utilizada, digite novamente");
					}
				}	
			}
			
			if(existe == false) {
				System.out.println("Senha não existe");
			}
			
			boolean finalizar = false;
			while(true) {
				System.out.println("deseja continuar: 0 para sim, 1 para não");
				int decisao = in.nextInt();
				
				if(decisao == 0) {
					break;
				} else if(decisao == 1) {
					finalizar = true;
					break;
				} else {
					System.out.println("Resposta invalida");
					continue;
				}
			}
			
			if(finalizar) {
				System.out.println("O programa acabou.");
				break;
			}
		}	
	}
}


