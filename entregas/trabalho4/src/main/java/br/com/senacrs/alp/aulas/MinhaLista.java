package br.com.senacrs.alp.aulas;

public class MinhaLista<T> implements Lista<T>{
	
	private Nodo<T> inicio = new Nodo<T>();
	
	@Override
	public void adicionarFinal(T valor) {
		
	}

	@Override
	public void adicionarInicio(T valor) {
		Nodo<T> nodoA = null;
		
		inicio.proximo = nodoA.proximo;
		nodoA = inicio;
		
		return resultado;
	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T obterPrimeiro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T obterUltimo() {
		
		return null;
	}

	@Override
	public T obterPosicao(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int obterTamanho() {
		
		int resultado = 0;
		Nodo<T> nodo = null;
		
		while(nodo.proximo != null){
			resultado++;
		}
		
		return resultado;
	}

	@Override
	public T removerPosicao(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void esvaziar() {
		
	}

}
