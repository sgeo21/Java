package optional;

import java.util.Optional;

public class Exemplo01 {

	public static void main(String[] args) {// o option mostra números nulos
		
		
		String[] palavras = new String[10];  // esse é um array 
		
		for(var palavra : palavras) { // essa parte é somente pra mostrar o que está dentro do array acima 
			System.out.println(palavra);
		} 
		
		Optional <String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if(checaNulo.isPresent()) {//aqui faz a verificação de um registro esta nulo
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);// se não for nulo ele mostra a palavra ou número
		}else {
			System.out.println("O valor é nulo!");// se não ele tranforma em vazio e mostra que é nulo. 	
		
		}			
	}
}