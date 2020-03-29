package by.htp.les11.c06;

public class TimeTest {

	public static void main(String[] args) {
		Time time = new Time ();
		
		time.setTime(22, 15, 30);
		System.out.println(time.getTime());
		
		time.addTime(3, 50, 35);
		System.out.println(time.getTime());
		
	}

}
