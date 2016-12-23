package search_engine;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.net.MalformedURLException;

public class Search_Demo {
	/**Main method creates the index and does the searching
	 * @param args
	 * @throws SQLException
	 * @throws MalformedURLException
	 * @throws Exception
	 */
	public static void main(String[] args) throws SQLException, MalformedURLException,  Exception {
		
	    Indexing in = new Indexing();
	    HashMap<String, ArrayList<Integer>> index = in.getTable();
	    HashMap<Integer,URL> urls = Crawling.getDatabase();
	
	    Inputs userInput = new Inputs();
		String keyword= userInput.input();
		int id=0;
		String key=keyword.toLowerCase();
		while (!key.equals("end")){
			if(index.containsKey(key)){
				for (int j=0; j<index.get(key).size();j++) {
					id=index.get(key).get(j);
					System.out.println(urls.get(id));
				}
	
			} else{
				System.out.println("The keyword you inserted does not match");
			}
			keyword = userInput.input();
			key=keyword.toLowerCase();
		
		}
		
	
	}
	
	
	

}
