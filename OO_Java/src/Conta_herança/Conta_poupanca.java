package Conta_herança;

public class Conta_poupanca extends Conta{
	
	
	public Conta_poupanca(long n, double t, double s, String b) {
		super(n, t, s, b);
		
	}
	public void atualizar(){
		
		this.setSaldo(this.getSaldo()+this.getTaxa());
	}
	
	public boolean sacar(double valor) {
		
		if(valor < this.getSaldo()) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}else {
			System.out.println("Valor maior que o saldo atual");
		}
		
		return false;
		
	
}
	public boolean depositar(double valor) {
		this.setSaldo(this.getSaldo()+valor);
		return false;}
		

}
