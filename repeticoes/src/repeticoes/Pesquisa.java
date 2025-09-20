package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				//todas abaixo são variaveis 
		int idade, esporte, totalderespostas = 0, futebol = 0, voleiM18 = 0, basquetem18 = 0;
		long somaIdades = 0;
		double mediaIdades = 0;
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")){
			
			System.out.println("Pesquisa - Esporte favorito");
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("1 - futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			System.out.println("Digite seu esporte favorito:");
			esporte = leia.nextInt();
			
			//Total de pessoas que gostam de futebol
			if (esporte == 1) { 
				futebol ++;
			}
			
			//Total de pessoas que gostam de volei e são maiores de 18 anos
			if (esporte == 2 && idade>= 18) {
				voleiM18 ++;
			}
			//total de pessoas que gostam de basquete e são menores de 18 anos 
			if (esporte == 3 && idade <= 18) {
				basquetem18 ++;
			}
			
			somaIdades += idade;
			totalderespostas ++;
			

			System.out.println("Deseja continuar (S/N)?");
			leia.skip("\\R"); // seria para tirar o dignificado do /n , pondo o cursor no começo.
			continua = leia.nextLine().toUpperCase();
			
		}
		
		mediaIdades = Math.round(somaIdades / totalderespostas); // precisa ser fora do laço
		
		System.out.printf("total de pessoas que gostam de futebol: %d%n", futebol);
		System.out.printf("total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("total de pessoas que gostam de basquete e são menores de 18 anos: %d%n", basquetem18);
		System.out.printf("Média das idades: %.2f%n", mediaIdades);
		leia.close();
		
		

	}

}
