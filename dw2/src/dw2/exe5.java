package dw2;

import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {

		String nome="";
		String genero="";
		String estado_civil="";
		int tempo = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite seu nome...");
		nome = leitor.nextLine();
		System.out.println("Digite seu genero...");
		genero = leitor.nextLine();
		System.out.println("Digite seu estado civil...");
		estado_civil = leitor.nextLine();

		if(genero.toUpperCase().equals("F") && estado_civil.toLowerCase().equals("casada")) {
			System.out.println("Digite o tempo ...");
			tempo = leitor.nextInt();
		}
		System.out.println("nome: "+nome);
		System.out.println("genero: "+genero);
		System.out.println("estado civil: "+estado_civil);
		System.out.println("tempo: "+tempo);

	}
}
