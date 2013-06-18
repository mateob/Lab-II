package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MinhaCOP implements ObterPathRequisicaoGet{

	@Override
	public String caminhoAbsoluto(Reader requisicao) {
		String resultado = null;
		
		if(requisicao == null){
			throw new IllegalArgumentException();
		}
		String dir = System.getProperty("user.dir");
		
		System.out.println(dir);
		
		//resultado = lerArquivo(requisicao);
		return resultado;
	}

	private String lerArquivo(Reader requisicao) {
		String resultado = requisicao.toString();
		String linha = null;
		try{
		FileReader fr =  new FileReader(resultado);
		if(fr.ready()){
			throw new IllegalArgumentException();
		}
		if(fr == null){
			throw new IllegalArgumentException();
		}
		
		
		while((linha)!= null){
			System.out.println(linha);
		}
		}catch(IOException ex){
			throw new IllegalArgumentException(ex);
		}
		
		return resultado;
	}

}
