package listadeexercicios4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	
	int numeros [][] = new int [3][3];
       
	String diagonalPrincipal = "", diagonalSecundaria = ""; 
	
	int somaPrincipal = 0, somaSecundaria = 0;
	
       //entrada de dados
       for(int linha = 0; linha< numeros.length; linha ++) { 
    	   for(int coluna = 0; coluna< numeros.length; coluna ++) { 
    		   System.out.println("Digite um número: ");
    		   numeros[linha][coluna]=leia.nextInt();
    	   }
       }
       //exibição de dados - listagem dos dados da matriz 
       for(int linha = 0; linha < numeros.length; linha ++) { 
    	   for(int coluna = 0; coluna< numeros[linha].length; coluna ++) { 
       System.out.printf("[%d] [%d]%n",linha, coluna);
    	   }
       }
       //Desenvolvimento do laço de repetição da diagonal principal
       for(int indice = 0; indice < numeros.length; indice ++) {
			diagonalPrincipal += numeros[indice][indice] + " ";
			somaPrincipal += numeros[indice][indice];
   
       }//desenvolvimento do laço de repetição da diagonal secundária
       for(int indice = 0; indice < numeros.length; indice ++) {
			diagonalSecundaria += numeros[indice][numeros.length - 1 - indice] + " ";
			somaSecundaria += numeros[indice][numeros.length - 1 - indice];
       }
       //gerando saida de texto com comandos de diagonal e soma
       System.out.println("Diagonal Principal: " + diagonalPrincipal);
		System.out.println("Diagonal Secundária: " + diagonalSecundaria);
		System.out.println("Soma dos elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos elementos da Diagonal Secundária: " + somaSecundaria);
      
       //fechamento da entrada
       leia.close();
	}

}
