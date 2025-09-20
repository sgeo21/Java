package listadeexercicios1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		
		System.out.println("Escreva o Salário: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Escreva o valor do Abono: ");
		numero2 = leia.nextDouble();
		
		
		System.out.printf("o novo salário é: %.2f%n",  numero1 + numero2);
		
	
		
		leia.close();
	} 

}
