package Curiosidades_Java;


// Inteiros aleatórios deslocados e escalonados.
import java.security.SecureRandom;//Programa usa a classe SecureRandom
public class Dado {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		for(int counter =1; counter <= 20; counter ++) {
			
			int lado = 1 + random.nextInt(6);
		    System.out.printf("%d ",lado);
		    
		    if(counter % 5 == 0)
		    	System.out.println();

	}

}}
