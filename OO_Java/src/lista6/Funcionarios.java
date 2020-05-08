package lista6;
import java.util.ArrayList;

public class Funcionarios {
	
	String  nome;
	double  salario;
	
	public Funcionarios(String n,double salario) {
		this.nome = n;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public ArrayList<Funcionarios> altaRenda(ArrayList<Funcionarios> func){
		ArrayList<Funcionarios> f1 = new ArrayList<Funcionarios>();
		
		for( Funcionarios f : func) {
			if(f.getSalario() > 5000) {
				f1.add(f);
			}
		}
		return f1;
		
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
 
