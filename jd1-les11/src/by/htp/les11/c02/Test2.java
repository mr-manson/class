package by.htp.les11.c02;

//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
//Добавьте конструктор, инициализирующий члены класса по умолчанию.
//Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {
	
	private int a;
	private int b;
	
	public Test2 () {
		this.a = 2;
		this.b = 4;
	}
	
	public int getA() {
		return a;
	} 

	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void print() {
		System.out.println("a = " + a + "\nb = " + b);
	}

}
