package lista2;

import java.util.Scanner;
import lista5.Estudante;

public class menuPrincipal {

	public static void main(String[] args) {
		
		
		
		
		Estudante e = null;
	

		Scanner scan = new Scanner(System.in);
        boolean testar = true;
		
		while (testar) {
			
		System.out.println("\n Menu alunos \n"
				+ "\n1.Criar Estudante\n"
				+ "\n2.Calcular Média\n"
				+" \n3.Obter número da matricula\n"
				+" \n4.Obter Endereço\n"
				 + "\n0. Sair");
		
		int op = scan.nextInt();
		switch(op) {
		
		case 1:
			
			System.out.println("Digite o nome do aluno :\n");
		    String nome = scan.nextLine();
		
			System.out.println("Digite a matricula do aluno (4 digitos) : "); 
			String matricula = scan.nextLine();
			
			System.out.println("Digite o endereço do aluno: ");
			String endereco = scan.nextLine();
			
			double notas [] = new double[4];
			
			for(int i =0;i<4;i++) {
				System.out.println("DIgite a "+ (i+1)+ "ª nota"); 
				notas[i] = scan.nextDouble();
			
			}
			e = new Estudante(nome, matricula, endereco, notas);
			break;	
		case 2:
			if(e!=null) {
			System.out.println(e.getNotas()); 
			}else {
				System.out.println("Estudante ainda não existe");
			}
			
			break;
		case 3:
			if(e!=null) {
			System.out.println(e.getMatricula());
			}else {
				System.out.println("Ainda sem matricula");
			}
			break;
			
		case 4:
			if(e!=null) {
			System.out.println(e.getEndereco());
			}else {
				System.out.println("Como você é burro");
			}
			break;
		default:
			testar = false;
		}
		
		 

			     
		
	}}}

	
			
		

