package br.com.alura.main;

import java.math.BigDecimal;

import br.com.alura.loja.descontros.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem( new ItemOrcamento(new BigDecimal("200")));
		Orcamento orcamento1 = new Orcamento();
		orcamento1.adicionarItem( new ItemOrcamento(new BigDecimal("1000")));		
		Orcamento  orcamento2 = new Orcamento(); 
		orcamento2.adicionarItem( new ItemOrcamento(new BigDecimal("500")));
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular( orcamento));
		System.out.println(calculadora.calcular( orcamento1));
		System.out.println(calculadora.calcular( orcamento2));


	}

}
