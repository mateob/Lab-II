package br.com.senacrs.alp.aulas;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MemissordeMenj implements EmissorMensagens {

	@Override
	public String formatarMensagem(String chave, Object... argumentos) {
		String resultado = null;
		
		if(chave == null){
			throw new IllegalArgumentException();
		}
		
		/* chave <string> = <string> argumento */
		BufferedReader leitor = null;
		
		leitor = obterBuffer(chave);
		resultado = lerBuffer(leitor);
		return resultado;
	}

	private String lerBuffer(BufferedReader leitor) {
		String resultado = null;
		String linha = null;
		ArrayList<String> lista = null;
		
		lista = new ArrayList<String>();
		
		try{
			linha = leitor.readLine();
			while(linha !=null){
				lista.add(linha);
				linha = leitor.readLine();
			
			}
		}catch(IOException e){
			throw new IllegalStateException(e);
		}
		return resultado;
	}

	
	private BufferedReader obterBuffer(String chave) {
		BufferedReader resultado = null;
		File file = null;
		FileReader reader = null;
		
		file = obterFile(chave);
		try{
			reader = new FileReader(file);
			resultado = new BufferedReader(reader);
		}catch(FileNotFoundException e){
			throw new IllegalStateException(e);
		}
		
		return resultado;
	}

	private File obterFile(String chave) {
		File resultado = null;
		
		verificarNomeArquivo(chave);
		resultado = new File(chave);
		verificarFile(resultado);
		
		return resultado;
	}

	private void verificarFile(File resultado) {
		if(resultado == null){
			throw new IllegalArgumentException();
		}
		if(!resultado.exists()){
			throw new IllegalArgumentException();
		}
		if(!resultado.isFile()){
			throw new IllegalArgumentException();
		}
		if(!resultado.canRead()){
			throw new IllegalArgumentException();
		}
		
		
	}

	private void verificarNomeArquivo(String chave) {
		if(chave == null){
			throw new IllegalArgumentException();
		}
		
		chave = chave.trim();
	}
}
