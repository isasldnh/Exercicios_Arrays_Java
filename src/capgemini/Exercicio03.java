package capgemini;

import java.util.Scanner;

public class Exercicio03 {
	
	static void gridString(String s) {
		int fraseSemEspaco = s.length();
		int k=0, linha, coluna;
		linha = (int) Math.floor(Math.sqrt(fraseSemEspaco));
		coluna = (int) Math.ceil(Math.sqrt(fraseSemEspaco));
		
		if (linha * coluna < fraseSemEspaco) {
			linha = coluna;
		}
		
		char grid[][] = new char[linha][coluna];
		
		for (int l=0;l<linha;l++) {
			for (int c=0;c<coluna;c++) {
				if (k < s.length()) {
					grid[l][c] = s.charAt(k);
				}
				k++;
			}
		}
		
		for(int l=0;l<linha;l++) {
			for (int c=0;c<coluna;c++) {
				if (grid[l][c] == 0) {
					break;
				}
				System.out.print(grid[l][c]);
			}
			System.out.println("");
		}
	}

	public static void main (String[] args) {
		
		//Solicita entrada da frase pelo usuário
		Scanner input = new Scanner (System.in);
		System.out.println("Insira uma frase qualquer:");
		//Leitura da frase
		String s0 = input.nextLine();
		String s = s0.replaceAll("\\s+", "");
		//Executa a função que transforma String-Grid
		gridString(s);
	}
}
