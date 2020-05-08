package lista2;

import java.util.Scanner;


public class atividade1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0; 
		
		int vetor [] = new int [10];  //vetor armazenando 10 números inteiros 
		
		for (int i = 0; i< 10; i++) { // Condição para inserir os números no vetor
			
			System.out.println("Digite um número ");
			vetor[i] = scan.nextInt(); // Adicionando os números no vetor 
			
		}
		
		
		
		for(int i = 0; i< vetor.length; i++) { // condição para somar os elementos digitados
			soma += vetor[i];
		}
		
		System.out.println("Soma dos elementos do array " + soma);
		
		

	}

}
