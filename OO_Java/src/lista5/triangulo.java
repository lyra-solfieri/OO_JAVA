package lista5;
import java.util.Scanner;




public class triangulo {
	Scanner entrada = new Scanner(System.in);
    double comprimento,largura, area, perimetro;
    
    public double Calcular_area() {
    	area = comprimento * largura;
    	return area;
    }
    public double Calcular_perimetro() {
    	perimetro = (2*comprimento) + (2*largura);
    	return perimetro;
    	
    }
    public void tela() {
    	System.out.printf("1.Criar um retângulo (Digitar valor de B e H)\n" ); 
    	System.out.printf("2.Calcular Área\n"); 
    	System.out.printf("3.Calcular Perímetro\n" ); 
    	System.out.printf("0.Sair\n" ); 
    	int num = entrada.nextInt();
    	
    	switch(num) {
    	case 1:
    		comprimento = entrada.nextDouble();
    		largura = entrada.nextDouble();
    	case 2:
    		
    		System.out.printf("\nCalculo da area = " + Calcular_area());
    	case 3:
    		System.out.printf("\nCalculo do perimetro = " + Calcular_perimetro());
    	case 0:
    		break;
    	default:
    		System.out.printf("Saiu");
    		
    }

}}