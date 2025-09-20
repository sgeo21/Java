package condicionais;

import java.util.Scanner;

public class Notas2 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
		
		float nota1, nota2, nota3, nota4, media;
		//todas as variáveis podem ser incluidas aqui! 
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		nota4 = leia.nextFloat();
		
		//a media foi incluida no float = variavel
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("A média do aluno é: %.2f%n", media);
		
		//Condição verdadeiro e falso se, senão
		if(media >= 7) {
		System.out.println("Aluno foi aprovado!");
		
		} else if(media >= 5 && media <7) {
		System.out.println("Aluno em recuperação (exame).");
		
	} else {
			System.out.println("Aluno foi reprovado!");
		}
		//neste caso se, senão, então...
		
		
       leia.close();
	}

	}

