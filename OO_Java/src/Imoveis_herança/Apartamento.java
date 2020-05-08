package Imoveis_herança;

public class Apartamento extends Imovel {
	String nome_predio;
	
	
	public Apartamento(String rua, String num, String bairro, String cid, String cep, double pre, boolean alu,
			boolean mobi, String np) {
		super(rua, num, bairro, cid, cep, pre, alu, mobi);
		this.nome_predio = np;
	}

	

	
	}


