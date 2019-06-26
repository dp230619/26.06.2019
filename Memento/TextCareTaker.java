import java.util.ArrayList;
import java.util.List;

public class TextCareTaker {
	
	List<TextMemento> allMementos = new ArrayList<>();
	
	int current = 0;
	
	public void AddMemento(TextMemento memento)
	{
		allMementos.add(current++, memento);
		// TODO: remove all after current
	}
	
	public TextMemento getLast()
	{
		TextMemento last = allMementos.get(allMementos.size() - 1);
		current--;
		return last;
	}

}
