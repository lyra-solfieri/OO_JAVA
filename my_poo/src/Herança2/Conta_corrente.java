package Herança2;

public class Conta_corrente extends Conta {

	public Conta_corrente(long n, double t, double s, String b) {
		super(n, t, s, b);
	}

	public void Atualizar() {
		
		this.setSaldo(this.getSaldo()-this.getTaxa());
	}
	
	public boolean sacar(double valor) {
		
		if(valor < this.getSaldo()) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
		
	
}
}