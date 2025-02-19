package desafios;

import java.util.Scanner;

public class segundoEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Informe o capital inicial: ");
		System.out.println("Informe a taxa de juros: ");
		System.out.println("Informe o tempo (Em anos ou meses): ");
		
		
		float c = sc.nextFloat();
		float i = sc.nextFloat();
		int t = sc.nextInt();
			
		float m = c * Math.pow(1+i,t); 
		
		
		
		sc.close();
		

	}

}
