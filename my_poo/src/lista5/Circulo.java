package lista5;

public class Circulo {
	
	double pi = 3.14;
	double raio;
	
	
	

	public Circulo(double raio2) {
		this.raio =raio2;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double Calcular_area_C() {
		double area;
		area = pi * Math.pow(raio,2);
		return area;
	}
	public double Calcular_perimetro_c() {
		double perimetro;
		perimetro = 2 * pi * raio;
		return perimetro;
	}

}
