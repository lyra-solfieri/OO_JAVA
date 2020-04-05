package Funcionario_herança;

public class Funcionario {
	String nome;
	String cpf;
	double salario;
	String nascimento;
	
	public Funcionario(String n,String cpf, double s, String nas) {
		
		this.nome = n;
		this.cpf = cpf;
		this.salario = s;
		this.nascimento = nas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	

}
