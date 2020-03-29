package by.htp.les11.oop01;

public class Text {
	private String text;
	private String title;
	
	public Text() {
	}

	public String addWord (Sentence snt, Word word){
		this.text = snt.getSnt() + " " + word.getWord();
		return text;
	}
	
	public void print (Text text) {
		System.out.println(text.getTitle());
		System.out.println(text.getText());
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
