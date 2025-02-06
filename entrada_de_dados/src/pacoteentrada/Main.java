package pacoteentrada;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Digite algum numero inteiro: ");
		Scanner sc = new Scanner(System.in);
		int x;
		double y;
		char z;
		x = sc.nextInt();
		System.out.println("\nDigite algum numero double: ");
		y = sc.nextDouble();
		System.out.println("\nDigite algum caractere: ");
		z = sc.next().charAt(0);
		sc.close();
		System.out.println("Você digitou um inteiro: " + x);
		System.out.println("Você digitou um double: " + y);
		System.out.println("Você digitou um char: " + z);

	}

}
