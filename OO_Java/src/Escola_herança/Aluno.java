package Escola_herança;
import java.util.Scanner;

public class Aluno extends Pessoa {
	
	
	Scanner scan = new Scanner(System.in);
	private double nota[] = new double[4];

	public Aluno(String nome, long cpf, String niver,double [] nota) {
		super(nome, cpf, niver);
		this.nota = nota;
		
	}
	
	
		
		
		
		
	
	
	

	public double media() {
		double soma = 0;
		for(int i = 0; i<4; i++) {
			soma = soma + nota[i]; 
		}
		return soma/4;
	}
	
	
	
	
	
	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	

}
