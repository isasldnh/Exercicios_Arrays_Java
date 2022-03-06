package capgemini;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int totalPares = 0;
		int vetor[] = {2,3,8,6,15,16,1,4,22};
		int n = vetor.length;
		
		//Escaneia numero para calculo da diferen�a
		Scanner ler = new Scanner (System.in);
		System.out.println("Adicione um n�mero inteiro qualquer: ");
		int x = ler.nextInt();

		//Loop para preenchimento do vetor
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//Condicional que valida a diferen�a entre os elementos do vetor
				if( vetor[i] - vetor[j] == x) {
					//Soma +1 ao n�mero total de pares com a diferen�a X definida pelo usuario
					totalPares++;
				}
			}
		}
		
	System.out.println("O total de pares com diferen�a igual a " + x + " � " +totalPares);
	}
}
