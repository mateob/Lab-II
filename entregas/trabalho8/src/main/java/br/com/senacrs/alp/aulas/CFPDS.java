package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class CFPDS implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario o1, Funcionario o2) {
		int resultado = 0;
		if(o1.getSalario() < o2.getSalario()){
			resultado = 1;
		}else if(o1.getSalario() > o2.getSalario()){
			resultado = -1;
		}else{
			resultado = 0;
		}
		return resultado;
	}
	
}

