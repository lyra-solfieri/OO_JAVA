package lista7;

public class Livros {
	
	private String autor;
	private String editora;
	private int ISBN;
	private String titulo;
	private int ano;
	
	// Constructor 
	public Livros(String autor, String editora,int isbn, String titulo, int ano) {
		this.autor = autor;
		this.editora = editora;
		this.ISBN = isbn;
		this.titulo = titulo;
		this.ano = ano;
	}
	// Get and Set 
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	

	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}
