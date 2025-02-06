package estrutura_if;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		if(num <= 11) {
			System.out.println("Bom dia");
		} else if(num >= 12 && num <= 18 ) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		sc.close();

	}

}
