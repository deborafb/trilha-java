package main;
import java.util.Scanner;
/*import main.ParametrosInvalidosException;*/

public class Contador {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}
		
		catch (ParametrosInvalidosException exception) {
		      System.out.println(exception.getMessage());
		}
		
		sc.close();
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroUm >= parametroDois) {
			
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}			
		
		int contagem = parametroDois - parametroUm;
		
		for (int i=0; i<contagem; i++) {
			System.out.println("Imprimindo o número " + Integer.toString(i + 1));
		}
	}

}
