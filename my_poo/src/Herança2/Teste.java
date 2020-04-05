package Herança2;

import java.util.Scanner;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		boolean yes = true;
		
		while(yes) {
			System.out.println("\n1.Cadastrar Cliente (Incluindo Conta corrente e Poupança)"
					+ "\n2.Saque da conta corrente(Procurar pelo CPF do Cliente)"
					+ "\n3.Saque da poupança(Procurar pelo CPF do Cliente)"
					+ "\n4.Depósito da conta corrente(Procurar pelo CPF do Cliente)"
					+ "\n5.Depósito da poupança(Procurar pelo CPF do Cliente)"
					+ "\n0.Sair");
			
			int o = scan.nextInt();
			switch(o) {
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String nome = scan.next();
				System.out.print("Digite o cpf do cliente: ");
				String cpf = scan.next();
				System.out.print("DIgite o número da conta: ");
				int conta = scan.nextInt();
				System.out.print("Digite o valor da taxa: ");
				double taxa = scan.nextDouble();
				scan.nextLine();
				System.out.print("Digite o nome do banco: ");
				String banco = scan.next();
				Conta_corrente cc = new Conta_corrente(conta,taxa,0,banco);
				Conta_poupanca cp = new Conta_poupanca(conta, taxa, 0, banco);
				Cliente c = new Cliente(nome, cpf, cc, cp);
				clientes.add(c);
				break;
			case 2:
				if(clientes.size() > 0) {
					
				}
			}
		}
		

	}

}
