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
		int i = 0;
		
		while(linha != null){
			if(linha[i] == null){
				resultado = false;
			}else if(linha[i].equals(GET) && linha[i].equals(HOST)){
				resultado = true;
			}	
			i++;
		}
		
		return resultado;
	}

	private boolean verTeste(String[] linha) {
		// TODO Auto-generated method stub
		return false;
	}

	private String[] lerReader(Reader requisicao) {
		String[] resultado = null;
		BufferedReader br = new BufferedReader(requisicao);
		int i = 0;
		try{
			while(br.readLine() != null){
				resultado[i] = br.readLine();
				i++;
				System.out.println("Passou por aqui");
			}
		}catch(IOException e){
			throw new IllegalArgumentException();
		}
		
		return resultado;
	}

}
