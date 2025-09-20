package condicionais;

import java.util.Scanner; 

public class Horoscopo { //classe

	public static void main(String[] args) { //método
		
		Scanner leia = new Scanner (System.in);
		// int = numero inteiro
		int signo;
		
		System.out.println("========================");
		System.out.println("   Horóscopo do dia     ");
		System.out.println("========================");
		System.out.println("                        ");
		System.out.println("     1 - Capricórnio    ");
		System.out.println("     2 - Aquário        ");
		System.out.println("     3 - Peixes         ");
		System.out.println("     4 - Áries          ");
		System.out.println("     5 - Touro          ");
		System.out.println("     6 - Gemeos         ");
		System.out.println("     7 - Câncer         ");
		System.out.println("     8 - Leão           ");
		System.out.println("     9 - Virgem         ");
		System.out.println("     10 - Libra         ");
		System.out.println("     11 - Escorpião     ");
		System.out.println("     12 - Sagitário     ");
		System.out.println("========================");
		System.out.println("Digite o número correspondete ao seu signo: ");
		signo = leia.nextInt();
		
		//Adicionar casos a serem selecionados 
		switch(signo) { //condição
		case 1: 
			System.out.println("Previsões signo 1");
			break;
		case 2:
			System.out.println("Previsões signo 2");
			break;
         case 3: 
        	 System.out.println("Previsões signo 3");
			break;
		case 4:
			System.out.println("Previsões signo 4");
			break;
        case 5: 
        	System.out.println("Previsões signo 5");
			break;
		case 6:
			System.out.println("Previsões signo 6");
			break;
		case 7: 
			System.out.println("Previsões signo 7");
			break;
		case 8:
			System.out.println("Previsões signo 8");
			break;
         case 9: 
        	 System.out.println("Previsões signo 9");
			break;
		case 10:
			System.out.println("Previsões signo 10");
			break;
        case 11: 
        	System.out.println("Previsões signo 11");
			break;
		case 12:
			System.out.println("Previsões signo 12");
			break;
			//Para adicionar número inexistente no menu
		default:
			System.out.println("Opção inválida!");	
		} // finaliza a condição
		leia.close(); //dentro do método
	} //fecha método

} //fecha classe
