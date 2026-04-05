package teste;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class player {
    
	    
	    public static void main(String[] args) {
	        //****************************************
	        //Não alterar o trecho de código abaixo
	        //****************************************
	    	
	        Scanner scanner = new Scanner(System.in);
	        String logradouro = scanner.nextLine();
	        
	        System.out.println(endereco(logradouro, "", ""));
	        
	        //****************************************
	        //Não alterar o trecho de código acima
	        //****************************************
	        System.out.println("digite o nme da sua rua");
	        String rua = scanner.nextLine();
	        System.out.println("digite o nme da sua rua");
	        String numero = scanner.nextLine();
	    }
	    
	    public static String endereco(String logradouro, String rua, String numero) {
	        
	        //****************************************
	        // Digite seu código aqui
	        //****************************************
	    	
	      
	        String solucao = "Rua:" + rua + "," + "número" + numero;
	        System.out.println("Rua:" + rua + "," + "número" + numero);
	        
	        //****************************************
	        // Para DEBUGAR utilize o System.err
	        //****************************************
	        System.err.println("My debug messages");

	        return solucao;
	    }
	}
