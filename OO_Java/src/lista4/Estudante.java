package lista4;

import java.util.Scanner;

public class Estudante {
	
	public String nome;
	public String matricula;
	public String endereco;
	public int notas[] = new int [4];
	
	// método
	public void alunos(String aluno,String matri,String ende, int [] n1 ) {
		this.nome = aluno;
		this.matricula = matri;
		this.endereco = ende;
		this.notas = n1;
		
	}
	Estudante(){			// Construtor default
		nome = "Lyra";
		matricula = "20192ADSGR0095";
		endereco = "AfrÂnio de carvalho";
		notas = new int[4];
		
				
	}
	public void getNome(){
		Scanner scan = new Scanner(System.in);
		nome = scan.nextLine();
		matricula = scan.nextLine();
		
		
	}
}


class Menu{
	public static void main(String[] args) {
		Estudante aluno =  new Estudante();
		aluno.getNome();
		
		System.out.println(aluno);
	}
	
	
	
}
