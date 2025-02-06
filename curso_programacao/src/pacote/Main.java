package pacote;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Hello World!");
		
		//System.out.println(x);
		//System.out.printf("%.2f%n", y);
		
		String nome = "Maria";
		int idade = 32;
		double renda = 1500.35784;
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
		
		
	}

}
