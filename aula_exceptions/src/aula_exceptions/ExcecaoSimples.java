package aula_exceptions;

public class ExcecaoSimples extends Exception{//exception pertece a uma classe do java
	//é uma classe que existe e assim você herda ela para dentro do programa 
	//é uma forma de lidar com os erros

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    //serial version lança a versão que deve ser lançada para cada entrada
    // ele encotnra no projeto onde está a parte do codigo que sera usada
	
	public ExcecaoSimples() {}
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}
}

