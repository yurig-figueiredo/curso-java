package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
import services.Calculate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter triangle X measure: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter triangle Y measure: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		Calculate.perimeter(x.perimeter, x.a, x.b, x.c);
		Calculate.perimeter(y.perimeter, y.a, y.b, y.c);
		
		Calculate.area(x.area, x.perimeter, x.a, x.b, x.c);
		Calculate.area(y.area, y.perimeter, y.a, y.b, y.c);
		
		String larger;
		
		if(x.area > y.area){
			larger = "X";
		} else if(x.area < y.area){
			larger = "Y";
		} else {
			larger = "X and Y are esquals";
		}
		
		System.out.println("Larger triangle: " + larger);
		
		sc.close();
		
		
		
	}

}
