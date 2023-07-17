package br.com.alura.main;

import java.math.BigDecimal;

import br.com.alura.loja.descontros.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento  orcamento1 = new Orcamento(new BigDecimal("100"), 0);
		Orcamento  orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular( orcamento));
		System.out.println(calculadora.calcular( orcamento1));
		System.out.println(calculadora.calcular( orcamento2));


	}

}
