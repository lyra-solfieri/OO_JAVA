package Imoveis_herança;

public class Imovel {
	String rua,numero,bairro,cidade,cep;
	double preco;
	boolean alugado,mobiliado;
	
	public Imovel(String rua,String num,String bairro,String cid,String cep,double pre, boolean alu,boolean mobi) {
		
		this.rua = rua;
		this.numero = num;
		this.bairro = bairro;
		this.cidade = cid;
		this.cep = cep;
		this.alugado = alu;
		this.mobiliado = mobi;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public boolean isMobiliado() {
		return mobiliado;
	}

	public void setMobiliado(boolean mobiliado) {
		this.mobiliado = mobiliado;
	}
	
	
	

}
