package Conta_herança;

public class Cliente {
	
	private String nome;
	private String cpf;
	private Conta_corrente conta_corrente;
	private Conta_poupanca conta_poupanca;
	
	
	public Cliente(String nome, String cpf,Conta_corrente c_c,Conta_poupanca c_p) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta_corrente = c_c;
		this.conta_poupanca = c_p;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Conta_corrente getConta_corrente() {
		return conta_corrente;
	}


	public void setConta_corrente(Conta_corrente conta_corrente) {
		this.conta_corrente = conta_corrente;
	}


	public Conta_poupanca getConta_poupanca() {
		return conta_poupanca;
	}


	public void setConta_poupanca(Conta_poupanca conta_poupanca) {
		this.conta_poupanca = conta_poupanca;
	}


	
	

}
