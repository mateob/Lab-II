package br.com.senacrs.alp.aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MLerArc implements LeitorArquivos {

	@Override
	public String[] lerArquivo(String arquivo) {
		String[] resultado = null;
		BufferedReader leitor = null;

		leitor = obterBuffer(arquivo);
		resultado = lerBuffer(leitor);

		return resultado;
	}

	@Override
	public String[] lerArquivoComSubstituicao(String arquivo, String busca, String substituicao) {
		String[] resultado = null;
		String[] parcial = null;
		String linha = null;
		parcial = lerArquivo(arquivo);
		resultado = new String[parcial.length];
		for (int i = 0; i < parcial.length; i++) {
			linha = parcial[i];
			resultado[i] = linha.replace(busca, substituicao);
		}
		return resultado;
	}

	private String[] lerBuffer(BufferedReader leitor) {
		String[] resultado = null;
		String linha = null;
		List<String> lista = null;

		lista = new ArrayList<String>();

		try {
			linha = leitor.readLine();
			while (linha != null) {
				lista.add(linha);
				linha = leitor.readLine();
			}
			resultado = converterListaArray(lista);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		return resultado;
	}

	private String[] converterListaArray(List<String> lista) {
		String[] resultado = null;

		resultado = new String[lista.size()];
		resultado = lista.toArray(resultado);
		/*
		 * Alternativa para "toArray" int ndx = 0;
		 * 
		 * for(String s : lista){ resultado[ndx++] = s; }
		 */
		return resultado;
	}

	private BufferedReader obterBuffer(String arquivo) {

		BufferedReader resultado = null;
		File file = null;
		FileReader reader = null;

		file = obterFileLeitura(arquivo);
		try {
			reader = new FileReader(file);
			resultado = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			throw new IllegalStateException(e);
		}

		return resultado;
	}

	private File obterFileLeitura(String arquivo) {
		File resultado = null;

		verificarNomeArquivo(arquivo);
		resultado = new File(arquivo);
		verificarFile(resultado);

		return resultado;
	}

	private void verificarNomeArquivo(String arquivo) {
		if (arquivo == null) {
			throw new IllegalArgumentException();
		}
		arquivo = arquivo.trim();
		
		
	}

	private void verificarFile(File file) {
		if (file == null) {
			throw new IllegalArgumentException();
		}
		if (!file.exists()) {
			throw new IllegalArgumentException();
		}
		if (!file.isFile()) {
			throw new IllegalArgumentException();
		}
		if (!file.canRead()) {
			throw new IllegalArgumentException();
		}

	}
}
