package search_engine;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;

public class Crawling_test {

	public static void main(String[] args) throws SQLException, MalformedURLException {
		try{
			HashMap<Integer,URL> urls = Crawling.getDatabase();
		    for (int i=1;i<=urls.size();i++) {
		    	System.out.println(urls.get(i));
		    }
		} catch (SQLException e ) {
	    	throw new IllegalStateException("problem!", e);
	    }  catch (MalformedURLException e) {
			System.out.println("unproper URL insertion");
	    } 
	}

}
