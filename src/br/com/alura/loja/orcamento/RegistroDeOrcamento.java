package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http; 
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}




	public void registrar(Orcamento orcamento) {
		/**(ABSTRAÇÂO)chamada HHTP para a API externa 
		 * Existem várias maneiras de implementar por 
		 * URL Connevtion
		 * Http Client
		 * lib Rest */
		//chamada HHTP para a API externa
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado!");
		}
		
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(), 
				"quantidade", orcamento.getQuantidadeItens()
				);
		
		http.post(url, dados);
		
		
		
	} 

}
