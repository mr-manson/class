package by.htp.les11.c01;

public class Test1Main {
	public static void main(String[] args) {
		Test1 t = new Test1();
		
		t.set(1, 2);
		t.print();
		System.out.println(t.max(3, 9));
		System.out.println(t.sum(3, 9));
	}
}
