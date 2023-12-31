package br.com.alura.main;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

public class TetesComposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
		
		
		OrcamentoProxy proxy = new OrcamentoProxy(novo);
		
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());

	}

}
