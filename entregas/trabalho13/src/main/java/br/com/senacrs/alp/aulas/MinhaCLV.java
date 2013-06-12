package br.com.senacrs.alp.aulas;

import java.io.Reader;

public class MinhaCLV implements ValidarRequisicaoGet{

	@Override
	public boolean ehRequisicaoGetValida(Reader requisicao) {
		if(requisicao == null){
			throw new IllegalArgumentException();
		}
		return false;
	}

}
