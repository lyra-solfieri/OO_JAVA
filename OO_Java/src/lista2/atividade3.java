package lista2;
import java.util.Scanner;
public class atividade3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float vetor [] = new float [10];
		float alunos = 0;
		
		for(int i = 0; i< 10;i++) {
			System.out.println("Digite a nota ");
			vetor[i] = scan.nextFloat();
			
		}
		
		for(float v : vetor) {
			if (v >= 7 & v <= 10) {
				alunos ++;
				
				
			}
			
		}
		System.out.println("Quantidade de alunos acima da média " + alunos);
	}

}
