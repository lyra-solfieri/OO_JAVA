package Herança3;

import java.util.Scanner;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Funcionario> funcionario1 = new ArrayList<Funcionario>();
		ArrayList<Gerente> funcionario2 = new ArrayList<Gerente>();
		
		boolean True = true;
		
		while(True) {
			System.out.print("\n1.Adicionar Funcionário"
					+ "\n2.Adicionar Gerente"
					+ "\n3.Listar todos os funcionários"
					+ "\n4.Mostrar o salário do gerente (procurar pelo CPF)"
					+ "\n0.Sair");
			int op = scan.nextInt();
			
			switch (op) {
			case 1:
				
				System.out.print("Nome do funcionário: ");
				String nome = scan.next();
				System.out.print("CPF do funcionário: ");
				String cpf = scan.next();
				System.out.print("Salário do funcionário: ");
				double salario = scan.nextDouble();
				scan.nextLine();
				System.out.print("data de nascimento: (00/00/00) ");
				String data = scan.next();
				Funcionario f = new Funcionario(nome,cpf,salario,data);
				funcionario1.add(f);
				
				System.out.println("Funcionário adicionado com sucesso !");
				break;
				
			case 2:
				
				System.out.print("Nome do gerente: ");
				String n = scan.next();
				System.out.print("CPF do gerente: ");
				String cpf2 = scan.next();
				System.out.print("Salário do gerente: ");
				double salario2 = scan.nextDouble();
				scan.nextLine();
				System.out.print("data de nascimento: (00/00/00) ");
				String data2 = scan.next();
				Gerente g = new Gerente(n,cpf2,salario2,data2);
				funcionario2.add(g);
				System.out.println("Gerente adicionado com sucesso!");
				break;
				
			case 3:
				if(funcionario1.size() > 0) {
					for(Funcionario f1 : funcionario1) {
						System.out.println("nome: " + f1.getNome());
						System.out.println("CPF: " + f1.getCpf());
						System.out.println("Salario: " + f1.getSalario());
						System.out.println("Nascimento: " +f1.getNascimento());
						
						
					}
				for(Funcionario f2 : funcionario2) {
					System.out.println("nome do gerente: " +f2.getNome());
					System.out.println("CPF: " + f2.cpf);
					System.out.println("Salario: " + f2.getSalario());
					System.out.println("nascimento: " +f2.getNascimento());
					
				}
				}
				break;
			case 4:
				System.out.println("Digite o cpf do gerente" );
				String cpf3 = scan.next();
			
				
				for(Gerente g1 : funcionario2){
					if(g1.getCpf().equals(cpf3)) {
						g1.Calcular_Salario();
						System.out.println("Salario do gerente: " +g1.getSalario());
						
						
					}else {
						System.out.println("CPF inválido");
					}
					
				}
				
				break;
				
			case 0:
				True = false;
				

				
			default:
				System.out.println(" Saiu !");
				True = false;
				break;
			}
			
	
		}

	}

}
