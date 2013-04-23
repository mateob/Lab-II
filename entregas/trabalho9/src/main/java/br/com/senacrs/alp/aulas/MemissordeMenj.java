package br.com.senacrs.alp.aulas;

public class MemissordeMenj implements EmissorMensagens {

	@Override
	public String formatarMensagem(String chave, Object... argumentos) {
		if(chave == null){
			throw new IllegalArgumentException();
		}
		return null;
	}

}
