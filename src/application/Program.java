package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		double [] vect = new double [n];
		// teste de mensagem v2
		char msgNeg = 'n';
		
		for (int i=0;i<n;i++) {
			System.out.print("Digite o numero: ");
			vect [i] = sc.nextInt();		
			// teste de mensagem v2
			if (vect[i] < 0) {
				msgNeg = 'y';
			}
		}
		// teste de mensagem v2
		if (msgNeg == 'y') {
			System.out.println("Números Negativos:");
		}
		
		for (int i=0;i<n;i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		double soma = 0.0;

		System.out.print("VALORES: ");
		
		for (int i=0;i<n;i++) {
			soma += vect[i];
			System.out.printf("%.1f ",vect[i]);
		}
		
		double media = soma / n;
		
		System.out.println();
		System.out.printf("A soma é: %.2f%n", soma);
		System.out.printf("A média é: %.2f%n", media);
		
		sc.close();
				
	}
}
