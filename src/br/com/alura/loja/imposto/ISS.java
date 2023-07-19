package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ISS extends Imposto{
	
	
	public ISS(Imposto outro) {
		super(outro);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected BigDecimal realizarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
