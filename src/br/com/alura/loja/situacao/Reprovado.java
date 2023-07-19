package br.com.alura.loja.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{


	public void finalizado(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
