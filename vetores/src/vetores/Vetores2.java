package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = {"Cintia", "Stella", "Patricia", "Rafaela", "Leticia", "Jamila"};
		
		System.out.println("listagem nomes");
		//vetor de números vazio, no caso de incluir o nomes.length pois ele ajusta o tamanho do vetor automaticamente
		int numeros[]= new int[5];
		
		//ordenar vetor
		Arrays.sort(nomes);		
		//Arrays.sort (nomes, collections.reverseOrder());
		
		//enquanto o numero não é mencionado no for não gera alterações ou empedimentos, porém pode gerar impedimentos em caso de estar em uso
		for(int indice = 0; indice < nomes.length ; indice++) {
		   System.out.printf("nomes [%d] = %s%n", indice, nomes[indice]);
		}
		System.out.println("/ninput de dados ");
		Arrays.sort(numeros);	
		//aqui leitura dos dados que serão utilizados (numeros)
		
		for(int indice = 0; indice < numeros.length ; indice ++) {
			System.out.println("Digite um número: ");
			numeros[indice] = leia.nextInt();
		}
		System.out.println("Listagem valores ");
			//vetor de números vazio, no caso de incluir o nomes.length pois ele ajusta o tamanho do vetor automaticamente
			//enquanto o numero não é mencionado no for não gera alterações ou empedimentos, porém pode gerar impedimentos em caso de estar em uso
			for(int indice = 0; indice < numeros.length ; indice++) {
			   System.out.printf(" [%d] = %d%n", indice, numeros[indice]);
		}
			leia.close();
	}

}
