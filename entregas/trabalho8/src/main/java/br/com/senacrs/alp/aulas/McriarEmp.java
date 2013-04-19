package br.com.senacrs.alp.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class McriarEmp implements Empresa{

	private String nome;
	private ArrayList<Departamento> depto = new ArrayList<Departamento>();
	
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
		CDOCPQF cpq = new CDOCPQF();
		Collections.sort(depto,cpq);
		return depto;
	}

	@Override
	public void adicionarDepartamento(Departamento departamento) {
		if(departamento == null){
			throw new IllegalArgumentException();
		}
		depto.add(departamento);
	}

	@Override
	public int quantidadeFuncionarios() {
		int conter = 0;
		int x =0;
		while(x < depto.size()){
			conter += depto.get(x).quantidadeFuncionarios();
			x++;
		}
		
		return conter;
	}
	
	

}
