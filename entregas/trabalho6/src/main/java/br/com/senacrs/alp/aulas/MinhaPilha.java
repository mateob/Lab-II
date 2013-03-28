package br.com.senacrs.alp.aulas;

public class MinhaPilha<T> implements Pilha<T> {
	
	Lista<T> lista = ListaFactory.getInstancia().criarLista();
	
	@Override
	public void insercao(T valor) {
				
	}

	@Override
	public T obter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remocao() {
		lista.removerPosicao(0);
		return null;
	}

	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub
		
	}

}
