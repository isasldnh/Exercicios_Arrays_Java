package capgemini;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int totalPares = 0;
		int vetor[] = {2,3,8,6,15,16,1,4,22};
		int n = vetor.length;
		
		//Escaneia numero para calculo da diferença
		Scanner ler = new Scanner (System.in);
		System.out.println("Adicione um número inteiro qualquer: ");
		int x = ler.nextInt();

		//Loop para preenchimento do vetor
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//Condicional que valida a diferença entre os elementos do vetor
				if( vetor[i] - vetor[j] == x) {
					//Soma +1 ao número total de pares com a diferença X definida pelo usuario
					totalPares++;
				}
			}
		}
		
	System.out.println("O total de pares com diferença igual a " + x + " é " +totalPares);
	}
}
