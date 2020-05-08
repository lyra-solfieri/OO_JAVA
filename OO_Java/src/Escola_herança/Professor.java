package Escola_herança;

public class Professor extends Pessoa {

	private double salario; 
	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Professor(String nome, long cpf, String niver,double salario) {
		super(nome, cpf, niver);
		this.salario = salario;
		
	}

}
