package teste;

import java.util.Scanner;

public class Teste1 {

	    
		public static void main(String[] args) {
		    //****************************************
	        // Não alterar o trecho de código abaixo
	        //****************************************
	        
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			System.out.println(resolver(str));
			
			//****************************************
	        // Não alterar o trecho de código acima
	        //****************************************
		}

		public static int resolver(String str) {
		    
		    //****************************************
	        // Digite seu código aqui
	        //****************************************
	        str = str.toUpperCase(); //para aceitar maísculas e mínusculas.
	        
	        //função transformar valor do simbolo/Caracter
	            switch (str){
	                case "I": return 1;
	                case "v": return 5;
	                case "X": return 10;
	                case "L": return 50;
	                case "C": return 100;
	                case "D": return 500;
	                case "M": return 1000;
	                default: return 0;
	                
					}
	            
				

				 int solucao = 0;
				for (int r = 0; r < str.length(); r++){
	                   int atual = str.charAt(r);
	                   if (r + 1 < str.length()) {
	                      int proximo = str.charAt(r + 1);
	                      if(atual < proximo) {
	                           solucao -= atual;
	                      }
	                  }
	                  solucao += atual;
	               }
			
		    //****************************************
	        // Para DEBUGAR utilize o System.err.println()
	        //****************************************
		    
		    System.err.println("My debug messages");
		    
			return solucao;
		}		
    }
    	//
