
public class Main {

	public static void main(String[] args) {

		MyTextEditor editor = new MyTextEditor("");
		editor.modifyText("hello");
		editor.modifyText("hello java");
		editor.modifyText("hello java c#");
		editor.modifyText("python");
		editor.crtlZ();
		System.out.println(editor.getText());
		
		editor.crtlZ();
		System.out.println(editor.getText());
		
		editor.crtlZ();
		System.out.println(editor.getText());		
		
	}

}
