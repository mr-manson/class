package by.htp.les11.c05;

public class CounterTest {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		counter.setRand(16);
		
		System.out.println(counter.plus());
		System.out.println(counter.minus());

	}

}
