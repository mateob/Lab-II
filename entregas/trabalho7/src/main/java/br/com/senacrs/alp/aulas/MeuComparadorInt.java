package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class MeuComparadorInt implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		int resultado = 0;
		
		if(par(o1) == par(o2)){
			resultado = comparaMesmaParidade(o1, o2);
		}else{
			resultado = comparaParidadeDistinta(o1, o2);
		}
		
		return resultado;
	}

	private int comparaParidadeDistinta(Integer o1, Integer o2) {
		int resultado = 0;
		
		if(par(o1)){
			resultado = -1;
		}else{
			resultado = 1;
		}
		return resultado;
	}

	private int comparaMesmaParidade(Integer o1, Integer o2) {
		int resultado = 0;
		
		resultado = o1.intValue() - o2.intValue();
		
		return resultado;
	}

	private boolean par(Integer o1) {
		
		boolean resultado = false;
		
		resultado = o1.intValue() % 2 ==0;
		
		return resultado;
	}
}
