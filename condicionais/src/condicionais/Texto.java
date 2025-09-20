package condicionais;

import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;  // se tem número
		String texto;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		System.out.println("Digite uma letra: ");
		leia.skip("\\R"); // no caso de ser número (diferente string )
		texto = leia.nextLine();
		
		System.out.println("A letra digitada foi: " + texto);
		System.out.println("O número digitado foi: " + numero);
		leia.close();
		
	}

}
