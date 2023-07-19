package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		// TODO Auto-generated method stub
		System.out.println("Enviando e-mail com dados do pedido!");
	}

}
