package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class MeuComparadorInt implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		int resultado = 0;
		if (o1 == null && o2 == null) { //se for nulo retorna 0
			resultado = 0;
		}else if (o1%2 == 0){  // o1 e par
			if(o1 > o2){ // o1 e menor que o2
				resultado =  -1;
			}else{ // o1 e menor que o2
				resultado = 1;
			}
		}else if(o2%2 != 0){ // se o2 por impar
			if(o1 < o2){ // 
				resultado = 1;
			}else{
				resultado = -1;
			}
		} else {
			resultado = o2.compareTo(o1);
		}
		return resultado;
	}
}
