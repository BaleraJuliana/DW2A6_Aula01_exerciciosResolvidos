package dw2;

import java.util.Scanner;

public class exe2 {
	
	public static void main(String[] args) {
		
		double preco = 0;
		double pagamento = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o preco ...");
		preco = leitor.nextDouble();
		
		System.out.println("Digite o pagamento ...");
		pagamento = leitor.nextDouble();
		
		System.out.println("A quantidade de litros eh " + (pagamento/preco));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
