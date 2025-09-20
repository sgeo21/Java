package repeticoes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		//não esquecer de colocar a entrada
		System.out.println("Digite um número inteiro:");
		numero = leia.nextInt(); 
		
		//definição do laço de repetição do tipo for
		// entre os parenteses qual é a (forma inicial e a forma final) 
		//pós incremento, vai somando 1 a cada passagem do laço
		for(int contador = 1; contador <= 10; contador ++) {
		System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
		}
		leia.close();
	}
	
	

}
