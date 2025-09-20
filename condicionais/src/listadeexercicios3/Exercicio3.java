package listadeexercicios3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, contador =1, idadem21 = 0, idadeM50 = 0; 
		String continua = "S";
		double somaidadesm21, somaidadesM50;
		
		
		//entrada seleção de S para continuação (string)
		while(continua.equalsIgnoreCase("S")) {
			 
		// entrada idade
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt(); 
		    if(idade > 0)
		//condição idade - 21
			if (idade <= 21) {
				idadem21 ++; }
			//Condição idade +50
			if (idade >= 50) {
				idadeM50 ++; } 
			//opcional e fechamento de opção continuar (String)
		System.out.println("Deseja continuar (S/N)?");
		leia.skip("\\R"); 
		continua = leia.nextLine().toUpperCase();
		} // resposta final da condição
		System.out.printf("total de pessoas com menos de 21 anos: %d%n", idadem21 ++);
		System.out.printf("total de pessoas com mais de 50 anos: %d%n", idadeM50 ++); 
	//fechamento de leia
	leia.close();
	} }
