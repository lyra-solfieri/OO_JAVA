package lista7;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu_library {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Livros> libi = new ArrayList<Livros>();
		
		boolean yes = true;
		
		while(yes) {
			
			System.out.println("*************MENU****************");
			System.out.println(" 1.    Cadastrar livro           ");
			System.out.println(" 2.    Buscar livro por título   ");
			System.out.println(" 3.    Listar livros por autor   ");
			System.out.println(" 4.    Listar todos os livros    ");
			System.out.println(" 0.    Sair                      ");
			System.out.println("*********************************");
			
			
			int op = scan.nextInt();
			scan.nextLine();
			switch(op) {
			
			case 1:
				
				System.out.print("Digite o nome do autor:  ");
				String autor = scan.next();
				System.out.print("Digite a editora:  ");
				String editora = scan.next();
				System.out.print("Digite o ISBN:  ");
				int isbn = scan.nextInt();
				scan.nextLine();
				
				System.out.print("Digite o título:  ");
				String titulo = scan.next();
				
				System.out.print("Digite o ano do livro:  ");
				int ano = scan.nextInt();
				scan.nextLine();
				
				
				libi.add(new Livros(autor, editora, isbn, titulo, ano));
				
				
				
				break;
			
			case 2:
				if(libi.size()>0) {
					System.out.println("Digite o título do Livro: ");
					String titulo2 = scan.nextLine();
					for(Livros lib : libi) {
						if(lib.getTitulo().equals(titulo2)) {
							System.out.println("Titulo: " + lib.getTitulo());
							System.out.println("Autor:  " + lib.getAutor());
							System.out.println("Editora: " + lib.getEditora());
							System.out.println("ISBN: "+ lib.getISBN());
							System.out.println("Ano: " + lib.getAno());
						}
							
					}}
				break;	
				
				
		   case 3:
			   if(libi.size()>0) {
				   System.out.println("Digite o Autor: ");
				   String autor2 = scan.nextLine();
				   for(Livros lib : libi) {
					   if(lib.getAutor().equals(autor2)) {
						   System.out.println("Título: " + lib.getAutor());
						   
					   }
				   }
			   }
			   break;
		   case 4:
			   if(libi.size()>0) {
				   for(Livros lib :libi) {
					   System.out.println("Título :  " + lib.getTitulo());
				   }
			   }
			   break;
			default:
				System.out.println("Saiu");
				yes = false;
				}
					
				
				
				
			}


		}


	}


