package maior_triango_sem_oop;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X:");
		double x_lado1 = sc.nextDouble();
		double x_lado2 = sc.nextDouble();
		double x_lado3 = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		double y_lado1 = sc.nextDouble();
		double y_lado2 = sc.nextDouble();
		double y_lado3 = sc.nextDouble();
		
		double p_x = (x_lado1 + x_lado2 + x_lado3) / 2;
		double p_y = (y_lado1 + y_lado2 + y_lado3) / 2; 
		
		double area_x = Math.sqrt(p_x * (p_x - x_lado1) * (p_x - x_lado2) * (p_x - x_lado3));
		double area_y = Math.sqrt(p_y * (p_y - y_lado1) * (p_y - y_lado2) * (p_y - y_lado3));
		
		System.out.printf("Triangle X area: %.4f\n", area_x);
		System.out.printf("Triangle Y area: %.4f\n", area_y);
		
		if(area_x == area_y) {
			System.out.println("X and Y are equals");
		} else if(area_x > area_y) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
