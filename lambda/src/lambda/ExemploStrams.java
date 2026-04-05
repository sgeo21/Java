package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStrams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> numerosDesordenados = Arrays.asList(6, 7, 8, 1, 4, 5, 9, 10, 2, 3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro", "Rio Grande do Sul");

		// Fazer uma
		List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0) // gera o filtro de números pares
				.collect(Collectors.toList()); // organiza a colection em lista
		System.out.println("Números pares: " + numerosPares); // saída dos dados
		System.out.println("Coleção original: " + numeros);

		// Metodo filter só faz a filtragem dos dados , para edição pode usar MAP?
		estados.stream()
		        .filter(e -> e.toUpperCase().startsWith("R")) // toUpperCase faz a edição de
		        // tudo para a letra maiscula, para verificação neste caso
		        // startsWith faz a localização das palavras iniciadas em R
				.distinct() // para imprimir somente as coisas diferentes
				.forEach(System.out::println);// parametro para imprimir o resultado com o metodo println
		        // os :: são como um atalho para chamar o metodo (chamada de atalho por
		        // referencia)
		        // somente pode ser usado dentro de métodos
		
		List<Double> numerosAoCubo = numeros.stream()
				.map(n -> Math.pow(n, 3))// elevar ao cubo os números da variavel numeros
				.collect(Collectors.toList()); //organiza a lista
		System.out.println("Números elevados ao cubo (Double)" + numerosAoCubo); //saída dos dados em double
		
		List<Integer> numerosAoCuboInteiros = numeros.stream()// mesma coisa anterior, outra fforma de escrever
				.map(n -> (int) Math.pow(n, 3))//trazer para inteiros para a operação
				.collect(Collectors.toList()); //ordenar
		System.out.println("Números elevados ao cubo (Inteiros) " + numerosAoCuboInteiros);//saída
		
		List<Integer> numerosOrdenados = numerosDesordenados.stream()
				.sorted() //fazer a operação de organizar os números em ordem crescente
				.collect(Collectors.toList());
		System.out.println("Números ordenados: " + numerosOrdenados);
		
		long estadosIniciandoEmR =estados.stream()
        .filter(e -> e.toUpperCase().startsWith("R"))
        .distinct()
		.count();
		System.out.println("Total de estados iniciados com a letra R: " + estadosIniciandoEmR);

	}

}
