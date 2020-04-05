package Herança1;

public class Pessoa {
	private String nome;
	private long cpf;
	private String fazer_niver;
	
	
		
	

	public Pessoa(String nome, long cpf2, String niver2) {
		this.nome = nome;
		this.cpf = cpf2;
		this.fazer_niver = niver2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getFazer_niver() {
		return fazer_niver;
	}

	public void setFazer_niver(String fazer_niver) {
		this.fazer_niver = fazer_niver;
	}

}
