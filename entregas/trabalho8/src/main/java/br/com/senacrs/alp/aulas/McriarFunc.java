package br.com.senacrs.alp.aulas;
import br.com.senacrs.alp.aulas.Departamento;
import br.com.senacrs.alp.aulas.Empresa;
import br.com.senacrs.alp.aulas.Funcionario;


public class McriarFunc implements Funcionario{
	
	private String nome;
	private Departamento Departamento;
	private Empresa empresa;
	private double salario;
	
	public McriarFunc(String nome, Departamento departamento, Empresa empresa, double salario){
		if(salario <= 0){
			throw new IllegalArgumentException();
		}
		if(departamento == null){
			throw new IllegalArgumentException();
		}
		if(nome == null){
			throw new IllegalArgumentException();
		}
		
		
		this.nome = nome;
		this.Departamento = departamento;
		this.empresa = empresa;
		this.salario = salario;
	}

	@Override
	public Empresa getEmpresa() {
		return this.empresa;	
	}

	@Override
	public Departamento getDepartamento() {
		return this.Departamento;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getSalario() {
		return this.salario;
	}
}
