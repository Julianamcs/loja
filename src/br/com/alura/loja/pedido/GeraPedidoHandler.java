package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	//construtor com injeção de dependencias: repository, service, etc.
	
	public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no banco de Dados");
		System.out.println("Enviar e-mail com os dados do novo peiddo");
	}

}
