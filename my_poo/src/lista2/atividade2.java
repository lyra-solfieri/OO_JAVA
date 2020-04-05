package lista2;
import java.util.Arrays;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numeros []  = new int [10];
		int soma = 0; int media = 0;
		
		for(int i =0; i < 10; i++) {
			System.out.println("Digite o número");
			numeros[i] = scan.nextInt();
			
		}
		for(int i=0; i<numeros.length; i++) {
			soma += numeros[i];
		}
		
		
		media = soma / 10 ;
		System.out.println("A media dos números digitados " + media);
		
        Arrays.sort(numeros); //isso ordena do menor para o maior
        int maior = numeros[9]; //o maior valor fica na última posição
        int menor = numeros[0]; //o menor número 
        
		System.out.println("O maior número "+ maior + "\nO menor número " + menor);
		
		
	}

}
