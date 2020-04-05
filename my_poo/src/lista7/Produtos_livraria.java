package lista7;
import java.util.Scanner;
import java.util.ArrayList;
public class Produtos_livraria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Produto> produto = new ArrayList<Produto>();
		
		boolean yes = true;
		
		while(yes) {
			System.out.println("\n1.Cadastrar produto"
					+ "\n2.Buscar Produto(procurar produto pelo nome)"
					+ "\n3.Listar todos os produtos"
					+ "\n4.Efetuar venda de produto"
					+ "\n0.Sair");
				
			
			int o = scan.nextInt();
			switch(o) {
			case 1:

				System.out.print("Digite o nome do produto: ");
				String nome = scan.next();
				
				System.out.print("Digite o código do produto ");
				int codigo = scan.nextInt();
				scan.hasNextLine();
				
				System.out.print("Digite o preço do produto ");
				double preco =scan.nextDouble();
				scan.hasNextLine();
				
				System.out.print("Digite a quantidade do produto ");
				int quantidade = scan.nextInt();
				scan.hasNextLine();
				
				produto.add(new Produto(nome,codigo,preco,quantidade));
				
				break;
			case 2:
				if(produto.size()>0) {
					System.out.print("Pesquisar por produto: ");
					String prod_p = scan.next();
					for(Produto p : produto) {
						if(p.getNome().equals(prod_p)) {
							System.out.println("O produto : " + p.getNome()+" ESTÁ no estoque");
							
						}else {
							System.out.println("Não temos esse produto");
						}
					}
				}
				break;
			case 3:
				if(produto.size()>0) {
					for(Produto p : produto) {
					System.out.println("Nome : "+ p.getNome());
					System.out.println("Código : "+ p.getCodigo());
					System.out.println("Preço : " + p.getPreco());
					System.out.println("Quantidade : "+ p.getQuantidade());
					System.out.println("-----------------------------------");
					scan.hasNextLine();
					
					
				}}
				break;
			case 4:
				if(produto.size()>0) {
					System.out.println("Vender o produto(Digite o produto): ");
					String prod_p = scan.next();
					for(Produto p : produto) {
						if(p.getNome().equals(prod_p)) {
							p.Vender_Produto();
							
							System.out.println("Produto vendido com sucesso!");
							System.out.println("Quantidade restante : " + p.getQuantidade());
						}
					}
					
				}
				
				break;
			case 0:
				System.out.println("Saiu.");
				yes = false;
				break;
				
			default:
				System.out.println("Operação inválida");
				yes =false;
				
			
			
		}
		
	}

}}
