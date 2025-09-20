package listadeexercicios3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//introdução de números pelo system.in (teclado).
		Scanner leia = new Scanner (System.in);
		//ler numeros inteiro e abrir variavel soma dos números
		int numero, somaNum = 0 ;
		// do while
		//somar numeros positivos digitados, até que o numero (zero) seja digitado
			do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt(); 
		//criar o se para definição de números a serem somados apenas maiores do que zero
			if(numero >= 0) {
	     	somaNum += numero;
	     	}
			//colocando qualquer número que seja diferente de zero
			} while ( numero != 0);
				System.out.printf("Soma dos números é: %d%n ", somaNum);
				
	           //fechamento da ação.
				leia.close();
			}
	}
