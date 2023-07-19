package br.com.alura.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;


public class JavaHttpClient implements HttpAdapter{

	@Override
	public void post(String url, Map<String, Object> dados) {
		// TODO Auto-generated method stub
		try {
			URL urlDaApi = new URL(url);
			URLConnection connection = urlDaApi.openConnection();
			connection.connect();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Erro ao enviar requisição HTTP", e);
		}
		
	}
	
	

}
