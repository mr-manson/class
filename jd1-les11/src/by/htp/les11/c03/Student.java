package by.htp.les11.c03;

public class Student {
	
	private String name;
	private String surname;
	private int groupNumber;
	private int[] marks = new int[5];
	
	public Student (String name, String surname, int groupNumber, int[] marks) {
		this.name = name;
		this.surname = surname;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public int[] getMarks() {
		return marks;
	}
}
