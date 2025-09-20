package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
	   //metodo collection set
		Set<String> frutas = new HashSet<String>();
		//dados entrada
		frutas.add ("Banana");
		frutas.add ("Maçã");
		frutas.add ("Laranja");
		frutas.add ("Abacate");
		frutas.add ("Banana");
		frutas.add ("banana");
		//dados saída
		System.out.println(frutas);
		//para saída em forma da conversão de dados que acontece dentro do hash que inclusive 
		//é o que permite que o mesmo não cause repetições
		for(String fruta: frutas) {
			System.out.println(fruta.hashCode());
		// por isso é muito utilizado para fazer codificações e 
		}
		//também podemos remover elementos
		frutas.remove("Abacate");
		
		System.out.println(frutas);
		// se acrescentar algum dado com letra maiscula e miniscula não é o mesmo elemento
		//o calculo do hash é assim, sempre de acordo com cada definição do teclado.
		//Para verificação de parte dentro do código
		System.out.println("A fruta Amora está presente no set?" + frutas.contains("Amora"));
		//para saber se os dados estão vazios
		System.out.println("O set esta vazio? " + frutas.isEmpty());
		//Para quando se quer fazer uma"cópia" depois dele não se pode adicionar os dados.
		Iterator<String> itfrutas = frutas.iterator();
		//
		while(itfrutas.hasNext()) {
			System.out.println(itfrutas.next());
		}
		//Para ordenar criar uma instancia de um novo objeto 
		ArrayList<String> frutasList = new ArrayList<String>();
		//adicionar todas as frutas na lista
		frutasList.addAll(frutas);
		// ordenar dados na lista de dados na ordem crescente
		frutasList.sort(null);
		//saida de dados
		System.out.println(frutasList);
		//ordenar dados na lista em ordem decrescente / precisa ter a lista ordenada primeiro
		frutasList.sort(Comparator.reverseOrder());
		//saida de dados
		System.out.println(frutasList);
		
	}

}
