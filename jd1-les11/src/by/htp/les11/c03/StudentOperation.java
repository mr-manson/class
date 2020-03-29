package by.htp.les11.c03;

public class StudentOperation {

	public static Student[] OkStudents(Student[] students) {
		Student[] temp = new Student[students.length];

		int i = 0;
		for (int j = 0; j < students.length; j++) {
			if (OkOrNot(students[j]) == 0) {
				temp[i] = students[j];
				i++;
			}
		}

		Student[] finish = new Student[i];
		for (int z = 0; z < i; z++) {
			finish[z] = temp[z];
		}

		return finish;
	}
	
	public static void printOkStudent(Student[] students) {
		for (int i = 0; i < students.length; i++) {
		System.out.println(students[i].getName() + " " + students[i].getSurname() + ", " + students[i].getGroupNumber());
		}
	}
	

	public static int OkOrNot(Student students) {
		int x = 0;
		int y = 1;
		int[] mark = students.getMarks();
		for (int a : mark) {
			if (a < 4) {
				x += y;
				;
			}
		}
		return x;
	}

}
