package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class MinhaCLV implements ValidarRequisicaoGet{

	private static String GET = "GET / http/1.1";
	private static String HOST = "Host: www.google.com";
	@Override
	public boolean ehRequisicaoGetValida(Reader requisicao) {
		
		boolean resultado = false;
		
		String[] linha;
		
		if(requisicao == null){
			throw new IllegalArgumentException();
		}
		
		linha = lerReader(requisicao);
		resultado = verTeste(linha);
		
		
		return resultado;
	}

	private boolean verTeste(String[] linha) {
		boolean resultado = false;
			if(linha == null){
				resultado = false;
			}else if(linha.equals(GET) && linha.equals(HOST)){
				resultado = true;
			}	
		return resultado;
	}

	private String[] lerReader(Reader requisicao) {
		String[] resultado = null;
		try{
			BufferedReader br = new BufferedReader(requisicao);
			String linha = null;
			int i = 0;
			
			while((linha = br.readLine()) != null){
				resultado[i] = linha;
				i++;
				System.out.println("Passou por aqui");
			}
		}catch(IOException e){
			throw new IllegalArgumentException();
		}
		
		return resultado;
	}

}
