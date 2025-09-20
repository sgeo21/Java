package operadores1;

public class Unario {

	public static void main(String[] args) {
		
		int preIncrementoOriginal = 8, preIncrementoResultado;
		int posIncrementoOriginal = 8, posIncrementoResultado;
		
		// pré 
		
		System.out.printf("Pre incremento: valor original = %d%n", preIncrementoOriginal);
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("Após incrementar a variável original: resultado =%d, valor Atualizado = %d%n", preIncrementoResultado, preIncrementoOriginal);
		
		System.out.println();
		
		System.out.printf("Pós incremento: valor original = %d%n", preIncrementoOriginal);
		posIncrementoResultado = posIncrementoOriginal++;
		System.out.printf("Após incrementar a variável original: resultado =%d, valor Atualizado = %d%n", posIncrementoResultado, posIncrementoOriginal);
	
		//pós testa depois de incremetar a condição
	}

}
