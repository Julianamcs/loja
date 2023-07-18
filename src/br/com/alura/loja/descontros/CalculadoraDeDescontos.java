package br.com.alura.loja.descontros;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto cadeiaDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoMaiorComValorQueQuinhetos(
						new SemDesconto()));
		
		return cadeiaDeDesconto.calcular(orcamento);
	}

}
