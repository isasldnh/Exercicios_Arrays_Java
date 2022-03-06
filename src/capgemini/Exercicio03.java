package capgemini;

import java.util.Scanner;

public class Exercicio03 {

	public static void main (String[] args) {
		
		//Solicita entrada da frase pelo usuário
		Scanner input = new Scanner (System.in);
		System.out.println("Insira uma frase qualquer:");
		//Leitura da frase
		String s = input.nextLine();
		//Separando a string letra a letra em um vetor
		String[] coluna = s.split(";");
		
		//Contagem dos caracteres sem espaço para definir tamanho máximo de linhas e colunas
		int fraseSemEspaco = s.replace(" ", "").length();
		//criando a matriz que vai armazenar as letras da frase
		char characters[][] = new char[fraseSemEspaco][fraseSemEspaco];
	
		
		for (int l=0; l < Math.sqrt(fraseSemEspaco); l++) {
			characters[l] = coluna[0].toCharArray();
		
			for (char[] char1 : characters) {
				for (char f : char1) {
					System.out.print(f + " ");
				}
				System.out.println("");
			}
		}
	}
}
