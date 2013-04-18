package br.com.senacrs.alp.aulas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class McriarDepto implements Departamento{
	
	private String nome;
	private Empresa empresa;
	
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

		return null;
	}

	@Override
	public List<Funcionario> listarFuncionariosPorDecrescenteSalario() {
		
		return null;
	}

	@Override
	public int quantidadeFuncionarios() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void adicionarFuncionario(Funcionario funcionario) {
		if(funcionario == null){
			throw new IllegalArgumentException();
		}
		
	}

}
