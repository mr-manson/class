package by.htp.les11.obj01;

// Создайте класс Test1 двумя переменными. 
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных,
// и метод, который находит наибольшее значение из этих двух переменных.

public class Test1 {
	private int a;
	private int b;

	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public void print() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
