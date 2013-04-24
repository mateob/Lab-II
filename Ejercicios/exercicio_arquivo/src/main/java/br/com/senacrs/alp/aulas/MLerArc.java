package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MLerArc implements LeitorArquivos{

	@Override
	public String[] lerArquivo(String arquivo) {
		String[] aux = null;
		try{
			File f = new File(arquivo);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			try{
				String line = br.readLine();
				
				while(line != null){
					line = br.readLine();
					aux += line;
				}
				br.close();
				fr.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return aux;
	}

	@Override
	public String[] lerArquivoComSubstituicao(String arquivo, String busca, String substituicao) {
		// TODO Auto-generated method stub
		return null;
	}

}
