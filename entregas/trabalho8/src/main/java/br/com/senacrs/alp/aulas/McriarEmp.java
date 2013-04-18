package br.com.senacrs.alp.aulas;

import java.util.List;

public class McriarEmp implements Empresa{

	private String nome;
	
	public McriarEmp(String nome){
		if(nome == null){
			throw new IllegalArgumentException();
		}
		
		this.nome = nome;
	}
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public List<Departamento> listaDepartamentoOrdemCrescentePorQtdFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarDepartamento(Departamento departamento) {
		if(departamento == null){
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	public int quantidadeFuncionarios() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
