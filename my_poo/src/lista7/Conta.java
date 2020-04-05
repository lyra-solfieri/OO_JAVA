package lista7;

public class Conta {
	
	
	
	
	private int numero;
	private String agencia;
	private String nome_do_cliente;
	private double saldo;
	
	
	
	
	
	
	
	

	public  Conta(int n, String a,String nome,double s) {
		this.numero = n;
		this.agencia = a;
		this.nome_do_cliente = nome;
		this.saldo = s;
		
		
		
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome_do_cliente() {
		return nome_do_cliente;
	}

	public void setNome_do_cliente(String nome_do_cliente) {
		this.nome_do_cliente = nome_do_cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double depositar(double valor) {
		
		saldo += valor;
		return saldo;
	}
	public double sacar(double valor) {
		if(saldo >= valor)
		saldo -= valor;
		return saldo;
		
	}
}
