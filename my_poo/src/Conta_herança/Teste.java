package Conta_herança;

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
				Conta_corrente cc = new Conta_corrente(conta,taxa,400,banco);
				Conta_poupanca cp = new Conta_poupanca(conta, taxa,400, banco);
				Cliente c = new Cliente(nome, cpf, cc, cp);
				clientes.add(c);
				break;
				
			case 2:
				System.out.print("Digite o cpf para sacar conta corrente ");
				String cpf2 = scan.next();
				for(Cliente c1 : clientes) {
					if(c1.getCpf().equals(cpf2)) {
						System.out.println("Digite o valor:  " );
						double sacar1 = scan.nextDouble();
						scan.nextLine();
						c1.getConta_corrente().sacar(sacar1);
						System.out.println("Dinheiro retirado com sucesso, seu atual saldo: " 
						+ c1.getConta_corrente().getSaldo());}}
						
				break;	
			case 3:
				System.out.print("Digite o cpf para sacar conta poupança");
				String cpf3 = scan.next();
				for(Cliente c2 : clientes) {
					if(c2.getCpf().equals(cpf3)) {
						System.out.print("Digite o valor: ");
						double sacar2 = scan.nextDouble();
						scan.nextLine();
						c2.getConta_poupanca().sacar(sacar2);
						System.out.print("Dinheiro retirado com sucesso, seu atual saldo: "
						+ c2.getConta_poupanca().getSaldo());}}
				
				
			   break;
			case 4:
				System.out.println("Digite o cpf para depositar conta corrente: ");
				String cpf4 =scan.next();
				for(Cliente c3 : clientes) {
					if(c3.getCpf().equals(cpf4)) {
						System.out.print("Valor: ");
						double dep1 =scan.nextDouble();
						c3.getConta_corrente().depositar(dep1);
						System.out.println("Saldo atual " + c3.getConta_corrente().getSaldo());
					}
				}
				break;
			case 5:
				System.out.println("Digite o cpf para depositar conta poupança: ");
				String cpf5 =scan.next();
				for(Cliente c4 : clientes) {
					if(c4.getCpf().equals(cpf5)) {
						System.out.print("Valor: ");
						double dep2 =scan.nextDouble();
						c4.getConta_poupanca().depositar(dep2);
						System.out.println("Saldo atual "+ c4.getConta_poupanca().getSaldo());}}
				
			case 0:
				yes = false;
				break;
			default:
				System.out.println("Hasta la vista, baby !!!!");
				break;
				
				
				
			}
		}
		

	}

}
