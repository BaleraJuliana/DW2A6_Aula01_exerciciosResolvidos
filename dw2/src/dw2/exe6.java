package dw2;

import java.util.Scanner;

public class exe6 {
	
public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero...");
		numero = leitor.nextInt();
		
		if(numero%2==0) {
			System.out.println("eh par");
		} else {
			System.out.println("eh impar");
		}
		
}

}
