package by.htp.les11.oop01;

public class TextTest {

	public static void main(String[] args) {
		Text text = new Text();
		text.setTitle("������.");
		Sentence snt = new Sentence ("����������� ������� ����");
		Word word = new Word ("�!");
		
		text.addWord(snt, word);
		
		text.print(text);
		

	}

}
