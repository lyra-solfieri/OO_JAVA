package lista5;
import java.util.Scanner;
public class Menu_Circulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio = 0;
		Circulo c = null;
		
		boolean True= true;
		
		while(True) {
			System.out.println( 
					 
					"1.Criar um círculo (Digitar valor de r)\n" + 
					"2.Calcular Área\n" + 
					"3.Calcular Perímetro\n" + 
					"4.Sair");
			
			int op = scan.nextInt();
			switch(op) {
			
			case 1:
				System.out.println("DIgite o valor de r ");
				raio = scan.nextDouble();
				c = new Circulo(raio);
				break;
			case 2:
				if(c!=null) {
					System.out.println(c.Calcular_area_C());
				}else {
					System.out.println("Sem valor");
				}
				break;
			case 3:
				if(c!=null) {
					System.out.println(c.Calcular_perimetro_c());
				}else {
					break;
				}
				break;
			case 4:
				if (op== 0) {
					True = false;
				}
			default:
				System.out.println("Saiu");
				True = false;
		}
		
		

	}

}}
