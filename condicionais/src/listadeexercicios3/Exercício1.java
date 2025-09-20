package listadeexercicios3;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//introdução as variaveis
		int numero1, numero2, contador = 0;
		//comando intrução dos números da operação
		System.out.println("Escolha o primeiro número:");
		numero1 = leia.nextInt(); 
		System.out.println("Escolha o segundo número:");
		numero2 = leia.nextInt(); 
		//criar a "regra" utilizando comandos if e for
		if (numero1 < numero2) {
			//incluir os números de escolha para os intervalos
		System.out.printf("No intervalo de %d e %d: %n" , numero1, numero2);
		//abrir a repetição
		for (contador = numero1; contador <= numero2 ; contador++) {
			//abrir a resposta 
		if(contador % 3 == 0 && contador % 5 == 0 && contador != 0) {
			System.out.printf("O %d é multiplo de 3 e 5%n", contador);
	 }
		}//fechar a resposta
		}else {
		System.out.println("intervalo inválido.");
		}
		//fechar o comando leia
	 leia.close();
	}
}
