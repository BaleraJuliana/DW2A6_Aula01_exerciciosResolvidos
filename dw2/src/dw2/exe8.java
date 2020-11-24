package dw2;

import java.util.LinkedList;
import java.util.Scanner;

public class exe8 {
	
	public static void main(String[] args) {
	
		double alturas[] = new double[15];
		Scanner leitor = new Scanner(System.in);
		int i = 0;
		double maior = 0, menor = 10000;
		
		for(i=0; i<15; i++) {
			
			System.out.println("Digite o "+(i+1)+"� valor");
			alturas[i] = leitor.nextDouble();
			
			if(menor > alturas[i]) {
				menor = alturas[i];
				continue; 
			}
			
			if(maior < alturas[i]) {
				maior = alturas[i];
				continue; 
			}
		}
		System.out.println("maior: "+maior);
		System.out.println("menor: "+menor);
	}
}
