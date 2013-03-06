package br.com.senacrs.alp.aulas;


public class Somatorio {
	
	private static Somatorio instancia = new Somatorio();
	
	private Somatorio() {

		super();
	}
	
	public double somaTotal(double[] valores) {
		
		double resultado = 0.0;
		
		if(valores == null){
				resultado = Double.NaN;
		}
		
		for(int i = 0;i <= 10; i++){
			resultado = resultado + valores[i];
		}
		//Implementar
		
		return resultado;
	}
	
	public static Somatorio getInstancia() {
		
		return Somatorio.instancia;
	}
}
