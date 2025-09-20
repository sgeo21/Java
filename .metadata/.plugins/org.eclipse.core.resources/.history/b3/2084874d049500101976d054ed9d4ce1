package listadeexerciciosmodulo8e9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		
		do {
			System.out.println("-------------------------------");
			System.out.println("   Selecine a opção desejada   ");
			System.out.println("-------------------------------");
			System.out.println(" 1 - Adicionar Cliente         ");
			System.out.println(" 2 - Listar todos os Clientes  ");
			System.out.println(" 3 - Retirar Clientes da lista ");
			System.out.println(" 0 - Sair                      ");
			System.out.println(" Digite a opção desejada:      ");
			opcao = leia.nextInt();
		
			switch(opcao) { 
		    case 1: 
			for (int indice = 0; indice <= 1; indice++) {
					System.out.println("Digite O nome do cliente: ");
					fila.add(leia.nextLine());
				}
			break;
		case 2:
			//opção2
			System.out.println("Os clientes em espera são:" + fila);
			break;
         case 3: 
        	 System.out.println("Digite o nome que deseja remover da lista: " + fila.remove());
			break;
         case 0: 
        	 System.out.println("Operação finalizada!");
			break;
         default:
        	 System.out.println("Opção invalida.");
			}
			}while(opcao !=0);
			
		
		
		leia.close();
			}
		}
		

		
	
			
		/*if (opcao == 1) {
			
	     }
		
		else if (opcao == 2) {
			//opção2
			
			
	     }
		else if (opcao == 3) {
			//opção3
			System.out.println("A fila dos clientes em espera são:" fila.removeall());
		} 
		else if (opcao == 0) {
			//opção3
			
		}*/
		

	
            //
		
	
    


