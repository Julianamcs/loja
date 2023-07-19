package br.com.alura.main;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.LogDePedido;
import br.com.alura.loja.pedido.acao.EnviarPedidoPorEmail;
import br.com.alura.loja.pedido.acao.CriarPedidoNoBanco;

public class TestesPedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new CriarPedidoNoBanco(), 
				new EnviarPedidoPorEmail(),
				new LogDePedido()
				));
		handler.executar(gerador);
		
	}

}
