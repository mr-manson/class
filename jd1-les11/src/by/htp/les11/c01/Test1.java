package by.htp.les11.c01;

// �������� ����� Test1 ����� �����������. 
// �������� ����� ������ �� ����� � ������ ��������� ���� ����������.
// �������� �����, ������� ������� ����� �������� ���� ����������,
// � �����, ������� ������� ���������� �������� �� ���� ���� ����������.

public class Test1 {
	private int a;
	private int b;

	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int max(int a, int b) {
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
