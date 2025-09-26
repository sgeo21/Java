package listadeexecícios4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeros[] = new int [10];
		int num = 0;
		
		for(int indice = 0; indice < numeros.length ; indice++) {
			   System.out.println("Digite um número: ");
				numeros[indice] = leia.nextInt();
		
		 System.out.printf("Digite o número que você deseja encontrar a posição: ");
		   num = leia.nextInt();
		   
		   if (num == (numeros[indice])) {
		System.out.println(numeros[indice]);
		   }
		}
		   /*for(int indice = 0; indice <= num; indice ++) {
			   System.out.printf(" [%d] = %d%n", indice, numeros[indice]);
		   }*/
		
		leia.close();
	}

}
