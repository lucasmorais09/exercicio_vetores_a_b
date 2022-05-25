package exercicios_prof_ohata;

import java.util.Scanner;

public class vetores_a_b {

	public static void main(String[] args) {
		
		//Declarar variáveis 
		int[] a = new int[5], b = new int[5];//Array que armazena valores de A e B
		
		int c =0;//Valor a ser exibido no final
		
		Scanner input = new Scanner(System.in);//Scanner para a entrada de dados
		
		for (int x = 0; x < 5; x++) {//Looping para atribuir valores de A e B
			
			//Entrada de dados de valores de A e B
			System.out.printf("Digite o %dº valor de A: ", (x + 1));
			a[x] = input.nextInt();
			System.out.printf("Digite o %dº valor de B: ", (x + 1));
			b[x] = input.nextInt();	
		}
		for (int x = 0; x < 5; x++) {//Looping para multiplicar e somar os valores de A e B
			
			c = c + a[x] * b[x];//Soma e multiplicação dos valores de A e B
		}
		
		//Exibir valor de C
		System.out.printf("O valor de C de é igual: %d", c);
	}

}
