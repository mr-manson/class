package by.htp.les11.c02;

//������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������.
//�������� �����������, ���������������� ����� ������ �� ���������.
//�������� set- � get- ������ ��� ����� ���������� ������.

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
