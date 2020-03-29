package by.htp.les11.c07;

public class TriangleTest {

	public static void main(String[] args) {
		Triangl tr = new Triangl(3, 6, 7);

		System.out.println("Периметр треугольника " + tr.perimetr(tr));
		System.out.printf("Площадь треугольника %.2f%n", tr.area(tr));
	}

}
