package lista3;
import java.util.Scanner;
public class atividade1 {

	static Scanner scan = new Scanner(System.in);
	
	
	public static int  Par_ou_impar(int a) {
		
		if (a  % 2  == 0) {
			System.out.println("é par ");
		   }else {
			   System.out.println("é impar"); 
				
			}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("Digite o número");
		int b = scan.nextInt();
		atividade1.Par_ou_impar(b); 
		

	}

}
