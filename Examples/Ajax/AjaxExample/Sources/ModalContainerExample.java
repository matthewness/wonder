import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;

import er.ajax.example.ExampleDataFactory;
import er.ajax.example.Word;
import er.extensions.foundation.ERXStringUtilities;

// Generated by the WOLips Templateengine Plug-in at 26.03.2008 12:58:41
public class ModalContainerExample extends WOComponent {
	public NSArray<Word> _words;
	public Word _repetitionWord;
	
	public ModalContainerExample(WOContext context) {
		super(context);
		_words = ExampleDataFactory.randomWords(10);
	}
	
	public String wordID() {
		return ERXStringUtilities.safeIdentifierName(String.valueOf(_words.indexOf(_repetitionWord)));
	}
}