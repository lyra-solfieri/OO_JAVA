package lista5;
import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double number1,number2,number3;
		double resultado;
		
		System.out.println("Digite os 3 valores e iremos retornar o maior valor utilizando o método maximum");
		number1 = scan.nextDouble();
		number2 = scan.nextDouble();
		number3 = scan.nextDouble();
		
		resultado = maximum(number1,number2,number3);
		
		System.out.println("O valor máximo digitado é " + resultado);
	}
	
	public static double maximum(double x,double y, double z) {
		
		/*double valor_maximo =x;
		
		if(y > valor_maximo) 
			valor_maximo = y;
		
		if(z > valor_maximo)
			valor_maximo = z;*/
			
		return Math.max(x, Math.max(y, z)); 
		
	}

}
