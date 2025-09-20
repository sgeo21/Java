package vetores;

import java.util.Scanner;

public class Vetores3 {//matriz

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//definir matrizes primeira de numeros inteiros 
		int numeros [][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//criação da variavel a partir da matriz de numeros
       float numerosReais [][] = new float[3][2];
       //nomear a variavel utilizada pelo laço de repetição for
       for(int linha = 0; linha< numeros.length; linha ++) { //percorrer linhas
    	   for(int coluna = 0; coluna< numeros.length; coluna ++) { //percorrrer colunas
           System.out.printf("numeros [%d][%d] = %d%n", linha, coluna, numeros[linha][coluna]);//forma de leitura para o leitor      
    	   } 
    	 }
       //entrada de dados
       for(int linha = 0; linha< numerosReais[linha].length; linha ++) { 
    	   for(int coluna = 0; coluna< numerosReais[linha].length; coluna ++) { 
    		   System.out.println("Digite um número: ");
    		   numerosReais[linha][coluna]=leia.nextFloat();
    	   }
       }
       //exibição de dados - listagem dos dados da matriz
       for(int linha = 0; linha < numerosReais.length; linha ++) { 
    	   for(int coluna = 0; coluna< numerosReais[linha].length; coluna ++) { 
       System.out.printf("numeros [%d][%d] = %.2f%n", linha, coluna, numerosReais[linha][coluna]);
    	   }//%d para numeros inteiros , %.2f para 2 numeros após a virgula , %f para numeros com virgula vários numeros
    	} // da erro pois a matriz irregular precisa ajustar pois ela tem apenas (nestecaso)2 linhas e 3 colunas
       //para solucionar isso na segunda parte ao invés de incluir a  inlcuir no for o tamanho da linha, de linha por linha
      
       //fechamento da entrada
       leia.close();
	} 

}
