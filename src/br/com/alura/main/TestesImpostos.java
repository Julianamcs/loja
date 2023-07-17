/**
 * 
 */
package br.com.alura.main;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

/**
 * @author JMCS
 *
 */
public class TestesImpostos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, TipoImposto.ICMS));
	}

}
