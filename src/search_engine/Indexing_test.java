package search_engine;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.net.MalformedURLException;

public class Indexing_test {

	public static void main(String[] args) throws SQLException, MalformedURLException,  Exception {
		Indexing in = new Indexing();
	    HashMap<String, ArrayList<Integer>> index = in.getTable();
	    
	    for (String key: index.keySet()) {
	    	System.out.println(key+"\n");
			for (int j=0 ; j<index.get(key).size(); j++) {
				System.out.println(index.get(key).get(j));
			}
			System.out.println();
			
		}

	}

}
