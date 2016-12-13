package search_engine;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.net.MalformedURLException;

public class Search_Demo {
	
public static void main(String[] args) throws SQLException, MalformedURLException,  Exception {
		
	    Indexing in = new Indexing();
	    HashMap<String, ArrayList<Integer>> index = in.getTable();
	    HashMap<Integer,URL> urls = Crawling.getDatabase();
	
	    Inputs userInput = new Inputs();
		String keyword= userInput.input();
		int id=0;
		
		while (!keyword.equals("end")){
			if(index.containsKey(keyword)){
				for (int j=0; j<index.get(keyword).size();j++) {
					id=index.get(keyword).get(j);
					System.out.println(urls.get(id));
				}
	
			} else{
				System.out.println("The keyword you inserted does not match");
			}
			keyword = userInput.input();
		
		}
		
	
	}
	
	
	

}
