package lista7;

public class Produto {
	
	private String nome;
	private int codigo;
	private double preco;
	private int quantidade;
	
	public Produto(String nome2, int codigo2, double preco2, int quantidade2) {
		this.nome = nome2;
		this.codigo = codigo2;
		this.preco = preco2;
		this.quantidade = quantidade2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int Vender_Produto() {
		quantidade -= 1;
		
		return quantidade;
	}
	
	/*public double Saldo() {
		
	}*/
	

	

}
