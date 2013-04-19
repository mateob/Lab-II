package br.com.senacrs.alp.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class McriarDepto implements Departamento{
	
	private String nome;
	private Empresa empresa;
	private ArrayList<Funcionario> func = new ArrayList<Funcionario>();
	
	public McriarDepto(String nome, Empresa empresa){
		if(nome == null){
			throw new IllegalArgumentException();
		}
		if(empresa == null){
			throw new IllegalArgumentException();
		}
		
		this.empresa = empresa;
		this.nome = nome;
	}
	@Override
	public Empresa getEmpresa() {
		return empresa;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public List<Funcionario> listarFuncionariosPorOrdemAlfabetica() {
		CFPOA ca = new CFPOA();
		Collections.sort(func,ca);
		return func;
	}

	@Override
	public List<Funcionario> listarFuncionariosPorDecrescenteSalario() {
		CFPDS cs = new CFPDS();
		Collections.sort(func,cs);
		return func;
	}

	@Override
	public int quantidadeFuncionarios() {
		return func.size();
	}

	@Override
	public void adicionarFuncionario(Funcionario funcionario) {
		if(funcionario == null){
			throw new IllegalArgumentException();
		}
		func.add(funcionario);
	}

}
