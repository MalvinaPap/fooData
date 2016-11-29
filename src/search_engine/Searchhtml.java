import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Character.UnicodeBlock;
public class Searchhtml {
	private static int counter;
	private HashMap< String, URL > site;
	private SortedSet< String > keywords;
	
	/*costructor method*/
	public Searchhtml(HashMap< String, URL > site) {
		this.site = site;
		counter = 0;
		keywords = new TreeSet<String>();
	}
	
	public void search() {
		 try {
			 BufferedReader input = new BufferedReader
		 }
	}
	
	public Set<String> getKeywords() {
		search();
		return keywords;
	}

	
}
