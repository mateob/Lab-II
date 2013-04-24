package br.com.senacrs.alp.aulas;

public class MInterString implements InterpretadorStrings{

	@Override
	public TIPO_STRING lerString(String str) {
		
		TIPO_STRING resultado = null;
		
		if(str != "<string>"){
			resultado =  TIPO_STRING.MAL_FORMADA;
		}
		return resultado;
	}

}
