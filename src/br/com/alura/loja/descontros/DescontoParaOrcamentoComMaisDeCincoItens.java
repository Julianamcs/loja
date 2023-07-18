package br.com.alura.loja.descontros;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{
	
	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor().multiply(new BigDecimal("0,1"));
	}
	
	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getQuantidadeItens() > 5; 
			
	}

}
