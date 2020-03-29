package by.htp.les11.oop01;

public class TextTest {

	public static void main(String[] args) {
		Text text = new Text();
		text.setTitle("Цитата.");
		Sentence snt = new Sentence ("Командовать парадом буду");
		Word word = new Word ("я!");
		
		text.addWord(snt, word);
		
		text.print(text);
		

	}

}
