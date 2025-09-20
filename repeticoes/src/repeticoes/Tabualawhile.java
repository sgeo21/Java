package repeticoes;

import java.util.Scanner;

public class Tabualawhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		int contador = 1;
		//não esquecer de colocar a entrada
		System.out.println("Digite um número inteiro:");
		numero = leia.nextInt(); 
		
		//
		while(contador <= 10) {
		System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
		contador ++;
		}
		
		leia.close();
	}

}
