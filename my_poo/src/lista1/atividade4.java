package lista1;

import java.util.Scanner;

public class atividade4 {
	
	static Scanner escanear = new Scanner(System.in); 
	
	public static void main(String[] args) {
		boolean x = true;
		float altura = 0;
		float contador = 0;
		float y = 0;
		
		while (x) {
			
			
			y = escanear.nextFloat();
			altura = altura + y;
			contador++;
			if(y == 0) {
				x = false;
			}
		

	}
		System.out.print(altura/contador);

	}}
