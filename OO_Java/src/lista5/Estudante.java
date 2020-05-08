package lista5;


public class Estudante {
	String nome;
	String endereco;

	String matricula;
	
	double notas[] = new double[4];

	public Estudante(String nome2, String matricula2, String endereco2, double[] notas2) {
		this.nome =nome2;
		this.endereco =endereco2;
		this.matricula =matricula2;
		this.notas=notas2;
	}

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	 public String getNome() {
	        return nome;
	    }
	
	
	
}
	


