package br.com.senacrs.alp.aulas;

public class Factory {
	
	private static final Factory instancia = new Factory();
	
	private Factory() {
	}
	
	public Funcionario criarFuncionario(Departamento departamento, String nome, double salario) {
	
		Funcionario resultado = null;
		
		resultado = new McriarFunc();
		
		return resultado;
	}
	
	public Departamento criarDepartamento(Empresa empresa, String nome) {
	
		Departamento resultado = null;
		
		resultado = new McriarDepto();
		
		return resultado;
	}
	
	public Empresa criarEmpresa(String nome) {
	
		Empresa resultado = null;
		
		resultado = new McriarEmp();
		
		return resultado;
	}
	
	public static Factory getInstancia() {
		return instancia;
	}
}
