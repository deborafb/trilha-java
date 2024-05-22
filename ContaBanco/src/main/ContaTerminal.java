package main;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		
	    System.out.print("\nDigite o código da agência: ");
		String agencia = sc.next();
		
	    System.out.print("\nDigite o seu nome completo: ");		
		String nomeCliente = sc.next();
		
	    System.out.print("\nDigite o saldo da conta: ");
		float saldo = sc.nextFloat();
		
	    System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, "
	    				  + "sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque!", 
	    				  nomeCliente, agencia, numero, saldo);
	    sc.close();

	}
}
