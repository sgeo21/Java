package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoListaQueue {

	public static void main(String[] args) {
		
		//aplicação muito comum para uso de filas e chmada de senhas por exemplo
		
		//para uso do preferencial preference queue
		Queue<String> fila = new LinkedList<String>();
		//inclusão de dados
        fila.add("Maria");
        fila.add("Aline");
        fila.add("Leticia");
        fila.add("Cintia");
        fila.add("Rayssa");
        //impressao da fila
        System.out.println(fila);
        //Retira ro elemento da fila
        fila.remove();
        //A fila sem a pessoa retirada
        System.out.println(fila);
        //adicionar novas pessoas a fila
        fila.add("Milena");
        fila.add("Nadia");
        //imprimir nova fila com as pessoas adicionadas -na fila sempre no final da fila por causa do método
        System.out.println(fila);
        //para mostrar o tamanho da fila 
        System.out.println("O tamanho da fila é: " + fila.size());
        //Mostrar primeira pessoa da fila
        System.out.println("A primeira pessoa da fila é: " + fila.peek());
        //variavel para caso precise mudar algo no meio do caminho 
        for(var pessoa : fila) {
        	System.out.println(pessoa);
        }
	}

}
