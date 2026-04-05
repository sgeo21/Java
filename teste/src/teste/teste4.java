package teste;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class teste4 {
	

	

		public static void main(String[] args) {
		    //****************************************
	        // Não alterar o trecho de código abaixo
	        //****************************************
			
			Scanner scanner = new Scanner(System.in);
			int[] nums = Stream.of(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
			int x = scanner.nextInt();
			
			System.out.println(Arrays.toString(resolver(nums, x)));
			
			//****************************************
	        // Não alterar o trecho de código acima
	        //****************************************
		}

		public static int[] resolver(int[] nums, int x) {
		    
		    //****************************************
	        // Digite seu código aqui
	        //****************************************
			//retorna 0s índices dos dois números de forma que eles somem x
			int[] solucao = new int[] { 0, 0 };
				
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] + nums[j] == x) {
						solucao[0] = i;
						solucao[1] = j;
						return solucao;
					}
				}
			}
			
			
			//****************************************
	        // Para DEBUGAR utilize o System.err.println()
	        //****************************************
	        
		    //System.err.println("My debug messages");
		    
			return solucao;
		}
	}

