package lista3;

import java.util.Scanner;

public class atividade2 {
	
	static Scanner scan = new Scanner(System.in);

	public static float soma(float a,float b) {
		float soma;
		soma = a + b;
		System.out.println("\nSoma = " +soma);
		return soma;
		}
	public static float subtracao(float a, float b) {
		float sub;
		sub = a - b;
		System.out.println("\nSubtração =  " +sub);
		return sub;
		
	}
	public static float multiplica(float a,float b) {
		float mult;
		mult = a *b;
		System.out.println("\nMultiplicação = " + mult);
		return mult;
	}
	public static float divisao(float a, float b) {
		float div;
		div = a /b;
		System.out.println("\nDivisão = " + div);
		return div;
	}
	public static void main(String[] args) {
		System.out.println("Digite dois números para saber as operações "); 
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		
		atividade2.soma(a, b);
		atividade2.divisao(a, b);
		atividade2.multiplica(a, b);
		atividade2.subtracao(a, b);

	}

}
