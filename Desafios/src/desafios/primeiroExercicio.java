package desafios;
import java.util.Scanner;
public class primeiroExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Grau Celcius: ");
		double celcius = sc.nextDouble();
		
		double fahrenheit = (celcius * 9/5) + 32;
		double kevin = celcius + 273.15;
		
		System.out.println("Temperatura convertida em Fahrenheit: " + fahrenheit);
		System.out.println("Temperatura convertida em Kevin: " + kevin);

		sc.close();
	}

}
