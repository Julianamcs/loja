package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.situacao.EmAnalise;
import br.com.alura.loja.situacao.Finalizado;
import br.com.alura.loja.situacao.Reprovado;
import br.com.alura.loja.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel{

	private BigDecimal valor;
	private SituacaoOrcamento situacao; 
	private List<Orcavel> itens;
	
	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.situacao = new EmAnalise();
		this.itens = new ArrayList<>();
		
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizado() {
		this.situacao.finalizar(this);
	}
	
	public void aplicadDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public BigDecimal getValor() {
		return valor;
	}



	public int getQuantidadeItens() {
		return itens.size();
	}


	public SituacaoOrcamento getSituacao() {
		return situacao;
	}


	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		// TODO Auto-generated method stub
		return situacao instanceof Finalizado;
	}

	
	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}
	
	
}
