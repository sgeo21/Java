package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true; //para gerar looping em caso de erros

		do {
			// estrutura Try para correção e prevenção de erros
			try { // seleção da parte que captura o erro
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);

				loop = false;

			} catch (InputMismatchException e) {//precisa importar
				System.err.println("Digite valores inteiros" + e); // System.err.println mostra
				// o erro em cor vermelha, para incluir o dado do erro colocar + e
				ler.nextLine();
			} catch (ArithmeticException e) {//não precisa importar pois é padrão
				System.err.println("Não existe divisão por zero!");
				ler.nextLine();
			} finally { //não é necessário colocar, porém ele vai sair em todas as partes
				System.out.println("Obrigado pela preferencia");
			}
		} while (loop);
	}
	// se a conta der certo ele sai do loop 
	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}
}
