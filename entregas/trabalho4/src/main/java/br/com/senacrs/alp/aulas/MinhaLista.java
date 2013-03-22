package br.com.senacrs.alp.aulas;

public class MinhaLista<T> implements Lista<T>{
	
	private Nodo<T> inicio = new Nodo<T>();
	
	@Override
	public void adicionarFinal(T valor) {
		
	}

	@Override
	public void adicionarInicio(T valor) {
		
	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		Nodo<T> nodo = null;
		Nodo<T> nodoNovo = null;
		nodo = obterNodoPosicao(posicao -1); //A
		nodoNovo.proximo = obterNodoPosicao(posicao);//D -> B
		nodo.proximo = nodoNovo; // A-> D
		nodoNovo.conteudo = valor;
	}

	@Override
	public T obterPrimeiro() {
		T resultado = obterPosicao(0);
		return resultado;
	}

	@Override
	public T obterUltimo() {
		int tamanho = obterTamanho();
		T resultado = obterPosicao(tamanho -1);
		return resultado;
	}

	private Nodo<T> obterNodoPosicao(int posicao){
		Nodo<T> nodo = inicio;
		int indice = -1;
		while(posicao != indice){
			nodo = nodo.proximo;
			indice++;
		}
		return nodo;
	}
	@Override
	public T obterPosicao(int posicao) {
		Nodo<T> nodo = null;
		nodo = obterNodoPosicao(posicao);
		return nodo.conteudo;
	}

	@Override
	public int obterTamanho() {
		
		int resultado = 0;
		Nodo<T> nodo = null;
		nodo = inicio;
		while(nodo.proximo != null){
			resultado++;
		}
		
		return resultado;
	}

	@Override
	public T removerPosicao(int posicao) {
		Nodo<T> nodo = null;
		nodo = obterNodoPosicao(posicao);
		T resultado = null;
		return resultado;
	}

	@Override
	public void esvaziar() {
		Nodo<T> nodo = inicio;
		nodo.proximo = null;
	}

}
