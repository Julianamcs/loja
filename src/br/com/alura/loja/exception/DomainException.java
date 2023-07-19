package br.com.alura.loja.exception;

public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 1; 
	
	public DomainException(String mensagem) {
		super(mensagem);
	}
	
	
}
