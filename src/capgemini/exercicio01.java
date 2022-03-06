package capgemini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercicio01 {
	public static void main(String[] args) {
		//Criando a lista 
		List<Float> numeros = new ArrayList<>();
		
		//Adicionando n�meros na lista
		numeros.add(4.0f);
		numeros.add(8.0f);
		numeros.add(1.0f);
		numeros.add(10.0f);
		numeros.add(3.0f);
		
		Collections.sort(numeros);
		calcularMediana(numeros);
	}
	
	//Calculando mediana
	public static void calcularMediana(List<Float> numeros) {
		float resultado=0.0f;
		
		//Se for impar
		if(numeros.size() % 2 != 0) {
			int posicaoNumeros = ((numeros.size() + 1)/2) - 1;
			resultado = numeros.get(posicaoNumeros);
		} else {
			//Se for par
			System.out.println("O n�mero de itens da lista deve ser �mpar!");
		}
		
		//Impress�o do resultado da mediana
		System.out.println("A mediana dos n�meros inclusos �: " +resultado);	
	}
}
