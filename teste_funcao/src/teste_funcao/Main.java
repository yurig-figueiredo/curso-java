package teste_funcao;

import java.util.Scanner;

public class Main {

	//Essa main já é uma função
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		
		
		int higher = max(num1, num2, num3);
		showResult(higher);
		
		sc.close();
	}
	public static int max(int a, int b, int c){
		int aux;
		
		if(a > b && a > c) {
			aux = a;
		} else if(b > c) {
			aux = b;
		} else {
			aux = c;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
