package Funcionario_herança;



public class Gerente extends Funcionario {

	public Gerente(String n, String cpf, double s, String nas) {
		super(n, cpf, s, nas);
		
	}
	
	public void Calcular_Salario() {
		
		this.setSalario(this.getSalario() + 2000);
		
		}
}
