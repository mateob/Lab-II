package br.com.senacrs.alp.aulas;

public class Factory {
	
	private static final Factory instancia = new Factory();
	
	private Factory() {
	}
	
	public LeitorArquivos criarLeitor() {
	
		LeitorArquivos resultado = null;
		
		resultado = new MLerArc();
		
		return resultado;
	}
	
	public static Factory getInstancia() {
		return instancia;
	}
}
