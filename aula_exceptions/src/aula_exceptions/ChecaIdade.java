package aula_exceptions;

import java.util.Scanner;

public class ChecaIdade {
	// usar o metodo throw
	

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
			try{
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			validarIdade(idade);
			}catch(ExcecaoSimples e) { //ArithmeticException 
				System.out.println("A pessoa não esta apta a dirigir!");
			}
	}

	public static void validarIdade(int idade) throws ExcecaoSimples{
		
		if(idade > 18)
			System.out.println("A Pessoa pode dirigir!!");
		else
			throw new ExcecaoSimples("A pessoa não pode dirigir");
		//eu estou colocando a excesão 
	}

}
