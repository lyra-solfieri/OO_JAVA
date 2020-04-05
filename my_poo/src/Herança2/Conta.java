package Herança2;

public class Conta {
	
	private long num_conta;
	private double taxa ;
	private double saldo;
	private String banco;
	
	
	//Construtor 
	
	public Conta(long n,double t,double s,String b) {
		this.num_conta = n;
		this.taxa = t;
		this.saldo = s;
		this.banco = b;
	}

	public long getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(long num_conta) {
		this.num_conta = num_conta;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

}
