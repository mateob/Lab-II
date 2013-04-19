package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class CFPOA implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario o1, Funcionario o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}
