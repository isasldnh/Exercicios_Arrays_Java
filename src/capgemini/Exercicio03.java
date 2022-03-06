package capgemini;

import java.util.Scanner;

public class Exercicio03 {
	
	static void gridString(String s) {
		//Calcula o tamanho da frase sem considerar espaços
		int fraseSemEspaco = s.length();
		int k=0, linha, coluna;
		//Calcula tamanho da linha e coluna baseado na raiz quadrada da fraseSemEspaco
		linha = (int) Math.floor(Math.sqrt(fraseSemEspaco));
		coluna = (int) Math.ceil(Math.sqrt(fraseSemEspaco));
		
		//Garante que o tamanho da matriz será suficiente
		if (linha * coluna < fraseSemEspaco) {
			linha = coluna;
		}
		
		//Cria a matriz e a matriz transposta
		char grid[][] = new char[linha][coluna];
		char[][] transposta = new char [grid[0].length][grid.length];
		
		//Faz o preenchimento da matriz com o uso da frase inserida pelo usuário
		for (int l=0;l<linha;l++) {
			for (int c=0;c<coluna;c++) {
				if (k < s.length()) {
					grid[l][c] = s.charAt(k);
				}
				k++;
			}
			
		}
		
		//Faz a conversão da matriz (grid) para a matriz transposta (transposta)
		for (int l=0;l<linha;l++) {
			for (int c=0;c<coluna;c++) {
				transposta[l][c] = grid[c][l];
			}
		}
		
		//Imprime a matriz invertida em apenas uma linha, com espaço entre as colunas
		for(int l=0;l<linha;l++) {
			for (int c=0;c<coluna;c++) {
				if (grid[l][c] == 0) {
					break;
				}
				System.out.print(transposta[l][c]);
			}
			System.out.print(" ");
		}
	}

	public static void main (String[] args) {
		
		//Solicita entrada da frase pelo usuário
		Scanner input = new Scanner (System.in);
		System.out.println("Insira uma frase qualquer:");
		//Leitura da frase
		String s0 = input.nextLine();
		String s = s0.replaceAll("\\s+", "");
		//Executa a função que transforma String-Grid e imprime a matriz transposta
		gridString(s);
	}
}
