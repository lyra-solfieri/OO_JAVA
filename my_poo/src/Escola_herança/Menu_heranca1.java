package Escola_herança;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu_heranca1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Aluno alu = null;
		ArrayList <Aluno> aluno = new ArrayList<Aluno>();
		ArrayList <Professor> professor = new ArrayList<Professor>();
		
		boolean yes = true;
		while(yes) {
			System.out.println("\n1.Cadastrar Aluno"
					+ "\n2.Cadastrar Professor "
					+ "\n3.Obter Média do aluno"
					+ "\n4.Obter informações do Aluno"
					+ "\n5.Obter informações do professor"
					+ "\n0.Sair");
			System.out.print("-------------------------------------------");
			int o = scan.nextInt();
			switch(o) {
			case 1:
				System.out.print("Digite o nome do aluno: ");
				String nome = scan.next();
				System.out.print("Digite o CPF: ");
				long cpf = scan.nextLong();
				scan.hasNextLine();
				System.out.print("Data de nascimento: ");
				String data = scan.next();
				System.out.print("Digite as notas:-------- ");
				double notas[] = new double[4];
				for(int i = 0; i< 4; i++) {
					System.out.print("Digite a " + (i+1) + " ª nota: ");
					notas[i] = scan.nextDouble();}
				
				
				aluno.add(new Aluno(nome,cpf,data,notas));
				break;
			case 2:
				System.out.print("Digite o nome do Professor: ");
				String nome2 = scan.next();
				System.out.print("Digite o CPF: ");
				long cpf2 = scan.nextLong();
				scan.hasNextLine();
				System.out.print("Data de nascimento: ");
				String date2 = scan.next();
				System.out.print("Digite o salário do Professor: ");
				double salario = scan.nextDouble();
				scan.hasNextLine();
				professor.add(new Professor(nome2,cpf2,date2,salario));
				break;
			case 3:
				if(aluno.size() > 0) {
					for(Aluno l : aluno) {
						System.out.println("A média do Aluno: " + l.media());
						
					}
					
				}
				break;
			case 4:
				if(aluno.size() > 0) {
					for(Aluno l : aluno) {
						System.out.print("Nome: " + l.getNome());
						System.out.print("Cpf: " + l.getCpf());
						System.out.print("Data: " + l.getFazer_niver());
						System.out.print("-------------------------------");
					
					}
						
					}
				break;
			case 5:
				if(professor.size() > 0) {
					for(Professor p : professor) {
						System.out.println("Nome: " + p.getNome());
						System.out.println("Cpf: " + p.getCpf());
						System.out.println("Data: " + p.getFazer_niver());
						System.out.println("Salário: " + p.getSalario());
						System.out.println("-------------------------------");
					}
				
				
				
			}
				break;
			case 0:
				System.out.println("Saiu");
				yes = false;
				break;
			default:
				System.out.println("Operação inválida");
				yes = false;
			
		}
	}}}

	


