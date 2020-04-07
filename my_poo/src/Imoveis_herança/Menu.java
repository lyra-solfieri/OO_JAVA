package Imoveis_herança;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	ArrayList<Casa> casa = new ArrayList <Casa>();
	ArrayList<Apartamento> apartamento = new ArrayList<Apartamento>();
	
	boolean True = true;
	while(True) {
		System.out.println("\n1.Registrar Casa"
				+ "\n2.Registrar Apartamento"
				+ "\n3.Listar Imóveis não alugados (pelo nome da rua)"
				+ "\n4.Listar todos os Imóveis mobiliados"
				+ "\n0.Sair");
		int o = s.nextInt();
		switch (o) {
		
		case 1:
			System.out.println("CASA");
			
			System.out.print("Rua: ");
			String rua = s.next();
			System.out.print("Número: ");
			String num = s.next();
			System.out.print("Bairro: ");
			String bairro = s.next();
			System.out.print("Cidade: ");
			String cidade = s.next();
			System.out.println("CEP: ");
			String cep = s.nextLine();
			s.nextLine();
			System.out.print("Digite o preço da casa: ");
			double preco = s.nextDouble();
			s.nextLine();
			
			//Condição para aluguel
			System.out.println("Está Alugada ? (S/N) Apenas letra maiuscula S(sim) ou N(não) ");
			String verificador = s.nextLine();
			char op = verificador.charAt(0);
			boolean alugada = false;
			switch (verificador) {
			case "S":
				boolean alugada_s = true;
				alugada = alugada_s;
				break;
			case "N":
				boolean alugada_n = false;
				alugada = alugada_n;
				break;
				default:
					System.out.println("Opcão inválida");
				break; }// Fim da condição aluguel
			
			
			
			//Condição mobiliada
			System.out.println("Está mobiliada ? (S/N) ");
			String verifica =s.nextLine();
			char op1  = verifica.charAt(0);
			boolean mobiliada = false;
			switch (verifica) {
			case "S":
				boolean mobiliada_s = true;
				mobiliada = mobiliada_s;
				break;
			case "N":
				boolean mobiliada_n = false;
				mobiliada = mobiliada_n;
				break;
				default:
					System.out.println("Opcão inválida");
				break;
			}// Final condição
			
			Casa c = new Casa(rua, num,bairro, cidade, cep, preco, alugada, mobiliada);
			casa.add(c);
			System.out.println("Casa adicionada com sucesso");
			break; 
		case 2:
			
			System.out.println("APARTAMENTO");
			
			System.out.print("Rua: ");
			String rua1 = s.next();
			System.out.print("Número: ");
			String num1 = s.next();
			System.out.print("Bairro: ");
			String bairro1 = s.next();
			System.out.print("Cidade: ");
			String cidade1 = s.next();
			System.out.print("CEP: ");
			String cep1 = s.next();
			System.out.print("Nome do predio: ");
			String nome_predio = s.next();
			s.nextLine();
			System.out.print("Digite o preço da casa: ");
			double preco1 = s.nextDouble();
			s.nextLine();
			
			//Condição para aluguel
			System.out.println("Está Alugada ? (S/N) Apenas letra maiuscula S(sim) ou N(não) ");
			String verificador1 = s.nextLine();
			char op2 = verificador1.charAt(0);
			boolean alugada_apt = false;
			switch (verificador1) {
			case "S":
				boolean alugada_sim = true;
				alugada_apt = alugada_sim;
				break;
			case "N":
				boolean alugada_no = false;
				alugada_apt = alugada_no;
				break;
				default:
					System.out.println("Opcão inválida");
				break; }// Fim da condição aluguel
			
			
			
			//Condição mobiliada
			System.out.println("Está mobiliada ? (S/N) ");
			String verifica2 =s.nextLine();
			char op3  = verifica2.charAt(0);
			boolean mobiliada2 = false;
			switch (verifica2) {
			case "S":
				boolean mobiliada_sim = true;
				mobiliada2 = mobiliada_sim;
				break;
			case "N":
				boolean mobiliada_nao = false;
				mobiliada2 = mobiliada_nao;
				break;
				default:
					System.out.println("Opcão inválida");
				break;
			}// Final condição
			
			Apartamento p  = new Apartamento(rua1,num1,bairro1,cidade1,cep1,preco1,alugada_apt,mobiliada2,nome_predio);
			apartamento.add(p);
			break;
			
			
		case 3:
			
			System.out.println("Digite o nome da rua para saber Casa não alugadas ");
			String rua_verificadora = s.next();
			
			for(Casa c1 : casa) {
				if(c1.getRua().equals(rua_verificadora)) {
					if(c1.alugado == false) {
						System.out.println("Numero da casa não alugada: " + c1.getNumero());
					}
				}
			}
			s.nextLine();
			System.out.println("Digite o nome da rua para saber  o apartamento não alugado: " );
			String rua_v2 = s.next();
			
			for(Apartamento p1 : apartamento) {
				if(p1.getRua().equals(rua_v2)) {
					if(p1.alugado == false) {
						
						System.out.println("Numero do apartamento não alugada: " + p1.getNumero());
				
					}}}
			
			
		
			
			break;
		case 4:
			for(Casa c1 : casa) {
				if(c1.mobiliado == true) {
					System.out.println("Rua da casa mobiliada " + c1.getRua());
					System.out.println("Número da casa mobiliada: " + c1.getNumero());
				}
			}
			s.nextLine();
			
			for(Apartamento p1 : apartamento) {
				if(p1.mobiliado == true) {
					System.out.println("Rua da apt mobiliada: " + p1.getRua());
					System.out.println("Número do apartamento mobiliado: " + p1.getNumero());
				}
			}
			
			break;
		case 0:
			True = false;
			break;
		default:
			System.out.println("Hasta la vista, baby !!!");
			break;
			
			
			
		
		}
	}
	

	}}


