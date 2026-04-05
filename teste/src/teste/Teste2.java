package teste;

import java.util.Scanner;

public class Teste2 {
	Scanner scanner = new Scanner(System.in);
	
	String str = scanner.nextLine();
	int x = scanner.nextInt();

	System.out.println(resolver(str, x));
	
	//****************************************
    // Não alterar o trecho de código acima
    //****************************************
}

public static String resolver(String str, int x) {
    
    //****************************************
    // Digite seu código aqui
    //****************************************
    // verificar quantidade de caracteres
    int quantidade = str.length(); 
    ////verificar tamanho partes
    int tamanho = quantidade / x;
    //verificar sobras
    int sobra = quantidade % x;
    
    //dividir partes
    StringBuilder base = new StringBuilder();
    
    for (int i = 0; i < x; i++){
        int comeco = i * tamanho;
        int fim = comeco + tamanho; 
        
        String comprimento = str.substring(comeco, fim);
        //linhas pares
        if ((i +1) % 2 == 0) {
            
            base.append(new StringBuilder(comprimento). reverse());
        } else {
            base.append(comprimento);
        }
    }
    // tratar o que sobra no final
    String fimdetudo = base.toString();
    
    //onde colocar as sobras
    StringBuilder inicio = new StringBuilder();
    StringBuilder finalizar = new StringBuilder();
    
   for (int i = 0; i < fimdetudo.length(); i++){
     char c = fimdetudo.charAt(i);
       if(i % 2 == 0){
          inicio.insert(0, c);
            
        } else{
            finalizar.append(c);
      }
    }
    
    
    
	String solucao = "";
	
	//****************************************
    // Para DEBUGAR utilize o System.err.println()
    //****************************************
    
    System.err.println("Não foi possivel realizar o vai e vem de palavras");

	return solucao;
}
}

