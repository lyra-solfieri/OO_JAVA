package lista1;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		
		
		
		double peso,altura;
		
		int abaixo = 0;
		int normal = 0;
		int acima = 0;
		
		double imcs[] = new double[5];
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		for(int i = 0; i < imcs.length; i++) {
			
			System.out.println("Insira o peso da " + (i+1) + "ª pessoa: ");
			peso = teclado.nextDouble();
			
			System.out.println("Insira a altura da " + (i+1) + "ª pessoa: ");
			altura = teclado.nextDouble();
			
			imcs[i] = peso/(Math.pow(altura, 2));
		}
		
		teclado.close();
	
		for(int i = 0; i < imcs.length; i++) {
			if(imcs[i] < 18.5) {
				abaixo += 1;
			}else if(imcs[i] >=18.5 && imcs[i] < 25) {
				normal += 1;
			}else {
				acima+=1;
			}
		}
		
		System.out.println("Pessoas abaixo do peso ideal: " + abaixo 
				+ "\nPessoas com o peso normal: " + normal 
				+ "\nPessoas que estão acima do peso: " + acima);
		
		
	}

}
