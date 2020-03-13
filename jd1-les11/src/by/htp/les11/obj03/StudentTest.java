package by.htp.les11.obj03;

public class StudentTest {
	public static void main(String[] args) {

		Student[] mas = new Student[10];

		mas[0] = new Student("Ivan", "Ivanov", 123, new int[] { 4, 5, 3, 4, 4 });
		mas[1] = new Student("Petr", "Petrov", 123, new int[] { 5, 5, 4, 4, 5 });
		mas[2] = new Student("Sidor", "Sidorov", 321, new int[] { 2, 3, 3, 4, 4 });
		mas[3] = new Student("Elena", "Elenina", 321, new int[] { 3, 3, 3, 3, 3 });
		mas[4] = new Student("Pavel", "Pavlov", 123, new int[] { 4, 4, 3, 4, 4 });
		mas[5] = new Student("Marina", "Marinina", 987, new int[] { 5, 5, 5, 5, 5 });
		mas[6] = new Student("Tatjana", "Tatjanina", 123, new int[] { 5, 5, 3, 4, 4 });
		mas[7] = new Student("Sergey", "Sergeev", 987, new int[] { 4, 3, 3, 4, 3 });
		mas[8] = new Student("Viktor", "Viktorov", 789, new int[] { 5, 5, 5, 4, 4 });
		mas[9] = new Student("Vasja", "Pupkin", 789, new int[] { 3, 5, 3, 4, 3 });

		
		Student[] okStudents;
		okStudents = StudentOperation.OkStudents(mas);
		StudentOperation.printOkStudent(okStudents);
		
	}
}
