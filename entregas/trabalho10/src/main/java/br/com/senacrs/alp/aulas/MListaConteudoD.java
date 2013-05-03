package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MListaConteudoD implements ListaConteudoDiretorio{

	@Override
	public String[] listarConteudo(File diretorio) {
		if(diretorio == null){
			throw new IllegalArgumentException();
		}
		if(!diretorio.isFile()){
			throw new IllegalArgumentException();
		}
		if(!diretorio.canRead()){
			throw new IllegalArgumentException();
		}
		if(!diretorio.exists()){
			throw new IllegalArgumentException();
		}
		try{
			FileReader fr = new FileReader(diretorio);
			BufferedReader br = new BufferedReader(fr);
			
			boolean tem = false;
			String x;
			int y = 0;
			while((x=br.readLine())!=null){
				String l[] = x.split("");
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		/* ou e D ou / - se por diretorio D, esta tudo na interfaze, se for um arquivo um "-"
		 * RWX - permições no diretorio - permição de leitura R não tem "-" tem permição de escrita W, não tem "-", tem permição de execução x, não tem "-"
		 * tamanho do arquivo ou do diretorio em bytes, 
		 * nome do diretorio.
		 * se tem as coisas e a letra correspondente, se não "-"
		 * a lista tem que estar em forma ordenada por hordem alfabetica. 
		 * Ex pares e impares. 
		 * 
		 * Apresentação
		 * 
		 * Pai/
		 * -> subDirA -> d_r-x_4196_subDirA "não precissa criar um metodo para os espasamentos. 
		 * -> subDirB -> d_-wr_4196_subDirB
		 * -> arq1 -> -_rw-_4169_arq1
		 * -> arq2 -> -_r--_4196_arq2
		 * 
		 *  usar apenas "File"
		 */
		return null;
	}

}
