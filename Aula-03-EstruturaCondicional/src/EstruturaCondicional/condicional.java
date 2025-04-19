package EstruturaCondicional;
import java.util.Scanner;
public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a primeira nota: ");
		System.out.println("Digite a segunda nota: ");
	
		
		double media = (nota1 + nota2)/2;
		
		System.out.println("A sua média final è: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado");			
		}
		else if (media >= 5) {
			System.out.println("Recuperação");
			
			System.out.print("Digite a nota do exame: ");
			double notaExame = sc.nextDouble();
			// double mediaFinal = (media + notaExame)/2;
			media = (media + notaExame)/2;
			System.out.println("A sua média final foi de: " + media);
			
		}
		else{
			System.out.println("Reprovado");	
		}
		
		
		sc.close();
		
	}

}
