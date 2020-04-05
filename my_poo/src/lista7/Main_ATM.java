package lista7;

import java.util.Scanner;
import java.util.ArrayList;

public class Main_ATM {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Conta> c = new ArrayList<Conta>();
		
		
		boolean yes = true;
		
		
		
		while(yes) {
			System.out.println("\n1.Cadastrar Conta"
					+ "\n2.Realizar depósito(procurar pelo nome do cliente)"
					+ "\n3.Realizar saque(procurar pelo nome do cliente)"
					+ "\n4.Verificar saldo(procurar pelo nome do cliente)"
					
					+ "\n0.Sair");
			System.out.print("*********************************************");
			int o = scan.nextInt();
			
			switch(o) {
			case 1:
				System.out.print("Digite o número da conta: ");
				int num = scan.nextInt();
				scan.hasNextLine();
				System.out.print("Digite a agência: ");
				String agencia = scan.next();
				System.out.print("Digite o nome do cliente: ");
				String nome = scan.next();
				System.out.print("Saldo: ");
				double saldo = scan.nextDouble();
				
				c.add(new Conta(num,agencia,nome,saldo));
				
				break;
			case 2:
				if(c.size() > 0) {
					System.out.println("Digite o nome do cliente ");
					String c2 = scan.next();
					for(Conta c1 : c) {
						if(c1.getNome_do_cliente().equals(c2)) {
							System.out.println("Digite o valor para depositar: ");
							double valor = scan.nextDouble();
							c1.depositar(valor);
							System.out.println("Deposito realizado com sucesso! Seu atual saldo :" + c1.getSaldo());
							
						}else {
							System.out.println("Operação inválida");
							
						}
						
						
						
					}
					
				}
				break;
			case 3:
				if(c.size() > 0) {
					System.out.println("Digite o nome do cliente ");
					String c2 = scan.next();
					for(Conta c1 : c) {
						if(c1.getNome_do_cliente().equals(c2)) {
							System.out.print("Digite o valor :");
							double valor = scan.nextDouble();
							scan.hasNextLine();
							c1.sacar(valor);
							
							
							
							
							System.out.println("Saque realizado com sucesso! Seu atual saldo :" + c1.getSaldo());
							
						}else {
							System.out.println("Operação inválida");
							
							
								
								
							
							
							
							
						}
						
						
						
					}
					
				}
				break;
			case 4:
				if(c.size() > 0) {
					for(Conta c1 :c ) {
						System.out.print("Conta: " + c1.getNumero());
						System.out.print("Agência: " + c1.getAgencia());
						System.out.print("Cliente: " + c1.getNome_do_cliente());
						System.out.print("Saldo: " + c1.getSaldo());
						System.out.print("**************************************");
						
					}
				}
				break;
			case 0:
				System.out.println("Saiu!");
				yes = false;
				break;
			default:
				yes = false;
				
			}
			
		}
		
	}

}
