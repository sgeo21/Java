package operadores1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
			
		// Instanciar um objeto de classe Scanner (para entrada de dados)
		
		Scanner leia = new Scanner(System.in);
			
		//Definir as variáveis
		// numero 1 e 2 neste caso são variaveis.
	
		double numero1, numero2;
		
		//Entrada de dados
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		// next duble é um tipo de leitura, vai depender de como sera feita.
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		// Efetuar os calculos. 
		
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2); // para soma
		// neste caso o operador é +
		// Pode ser usado println ou printf, só ter atenção a variação dos códigos
		//para ln System.out.println("Digite o segundo número: ");
		// Para f System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2);
		// Sempre explicar para o código qual o numero de entrada e qual a operação a ser realizada.
		
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2); //para subtração
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1 * numero2); // para mutiplicação
		System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, numero1 / numero2); // para divisão
		// abaixo operações que utilizam a biblioteca 'math'
		System.out.printf("%.2f ^ %.2f = %.2f%n", numero1, numero2, Math.pow(numero1 , numero2)); // Para potência 
		System.out.printf("Raiz Quadrada de %.2f = %.2f%n", numero1, Math.sqrt(numero1)); // Para Raiz quadrada
		leia.close();
	}
}
