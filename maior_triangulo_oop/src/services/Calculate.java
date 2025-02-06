package services;

public class Calculate {
	public static void perimeter(double t, double x, double y, double z) {
		t = (x + y + z) / 2;
	}
	public static void area(double a, double p, double x, double y, double z) {
		a = Math.sqrt(p * (p - x) * (p - y) * (p - z));
	}
}
