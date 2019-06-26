
// Originator
public class MyTextEditor {

	private TextCareTaker savedText = new TextCareTaker();
	
	public MyTextEditor(String text) {
		super();
	}

	private String text;

	public String getText() {
		return text;
	}
	
	public void modifyText(String newText)
	{
		savedText.AddMemento(new TextMemento(this.text));		
		this.text = newText;
	}

	public void crtlZ()
	{
		this.text = savedText.getLast().getSavedText();
	}
	
}
