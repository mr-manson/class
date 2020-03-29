package by.htp.les11.c07;

public class Triangl {
	private int a;
	private int b;
	private int c;

	public Triangl() {
	}

	public Triangl(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
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

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int perimetr(Triangl tr) {
		int perimetr = tr.getA() + tr.getB() + tr.getC();
		return perimetr;
	}

	public double area(Triangl tr) {
		double halfPer = perimetr(tr) / 2;
		double area = Math.sqrt(halfPer * (halfPer - tr.getA()) * (halfPer - tr.getB()) * (halfPer - tr.getC()));
		return area;
	}
}
