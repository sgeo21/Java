package helloworld;

import java.util.Scanner;

public class VariaveisJava {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu peso: ");
		
		int peso = leia.nextInt();
		
		System.out.println("Digite uma opção: ");
		char opcao = leia.next().charAt(0);
		
		System.out.println("Digite o valor: ");
		float valor = leia.nextFloat();
		
		
		System.out.println("O valor da variável de peso é: " + peso);
		
		System.out.println("O valor da variável de opcao é: " + opcao);
		
		System.out.println("valor da variável valor é: " + valor);
		
		System.out.printf("o valor da variavel o valor é: %.2f \n", valor);
		
		leia.close();
	}

}
