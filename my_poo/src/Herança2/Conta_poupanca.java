package Herança2;

public class Conta_poupanca extends Conta{
	
	
	public Conta_poupanca(long n, double t, double s, String b) {
		super(n, t, s, b);
		
	}
	public void atualizar(){
		
		this.setSaldo(this.getSaldo()+this.getTaxa());
	}

}
