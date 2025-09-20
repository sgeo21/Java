package arrays;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList <Integer>();
		 numeros.add(5);
		 numeros.add(7);
		 numeros.add(8);
		 numeros.add(10);
		 numeros.add(5);
		
		 System.out.println(numeros);
		 
		 System.out.println("Exibir o indice na posição 2: " + numeros.get(2));
	}

}
