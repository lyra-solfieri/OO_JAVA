package Curiosidades_Java;


// Rola um dado de seis lados 6.000.000 vezes.

import java.security.SecureRandom;;
public class Dados_2 {

	public static void main(String[] args) {
		
		// Números aleatórios seguros 
		SecureRandom ran = new SecureRandom();
		
		int lan1=0,lan2=0,lan3=0,lan4=0,lan5=0,lan6=0;
		
		for(int roll = 1; roll <= 6000000;roll++) {
			int face = 1 + ran.nextInt(6);
			
			switch(face) {
			case 1:
				++lan1;
				break;
			case 2:
				++lan2;
				break;
			case 3:
				lan3++;
				break;
			case 4:
				lan4++;
				break;
			case 5:
				lan5++;
				break;
				
			case 6:
				lan6++;
				break;
				
			}
		}
		System.out.println("Face\tFrequency"); // cabeçalhos de saída
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
				lan1, lan2, lan3, lan4,
				lan5, lan6);

	}

}
