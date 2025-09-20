package listadeexercicios1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		double numero1, numero2, numero3, numero4;
		
		System.out.println("Adicione a primeira nota: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Adicione a segunda nota: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Adicione a terceira nota: ");
		numero3 = leia.nextDouble();
		
		System.out.println("Adicione a quarta nota: ");
		numero4 = leia.nextDouble();
		
		
		System.out.println("A média é:") ;
		
		System.out.printf("(%.1f + %.1f + %.1f + %.1f) / 4 = %.1f%n ", numero1, numero2, numero3, numero4, (numero1 + numero2 + numero3 + numero4) / 4) ;
		
		leia.close();
	}

}
