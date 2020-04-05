package lista1;

import java.util.Scanner;

public class atividadade5 {

	public static void main(String[] args) {
		
		System.out.println("Qual a operação :");
		Scanner escanear = new Scanner(System.in);
		
		char op ;
		 op = escanear.nextLine().charAt(0);
		
		System.out.println("Qual o primeiro numero: ");
		float num1 = escanear.nextFloat();
		
		System.out.println("Qual o segundo numero:");
		float num2 = escanear.nextFloat();
		System.out.println();
		
		
       
		
		switch( op )
        {
            case '+':
                System.out.print(num1 + num2);
                break;        
                
            case '-':
                System.out.print(num1 - num2);
                break;
                
            case '*':
                System.out.print(num1 * num2);
                break;
                
            case '/':
                System.out.print(num1 / num2);
                break;
            
            default:
                System.out.printf("Você digitou uma operação inválida.");       
            
        }
		
	}

}
