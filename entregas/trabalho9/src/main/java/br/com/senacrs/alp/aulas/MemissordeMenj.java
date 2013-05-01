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
		if(ehBemFormatada(chave, argumentos)){
			
		}
		resultado = String.format(chave, argumentos);
		if(resultado == null){
			throw new IllegalArgumentException();
		}
		/* chave <string> = <string> argumento */
		
		return resultado;
	}

	private boolean ehBemFormatada(String chave, Object[] argumentos) {
				
		return false;
	}

	
}
