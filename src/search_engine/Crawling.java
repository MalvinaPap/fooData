
package search_engine;

import java.util.HashMap;
import java.util.List;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.ArrayList; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Crawling {

/*constructor*/	
	public Crawling() {
	}
	
	
	public static HashMap<Integer,URL> getDatabase() throws SQLException, MalformedURLException {
		
		String url = "jdbc:mysql://localhost:3306/foodatab";
		String username = "root";
		String password = "123456789";
		int id = 1;

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		    Statement stmt = null;
		    String query = "SELECT * FROM foodatab.urls u;";
		    HashMap<Integer,URL> urls = new HashMap<>();
		    try {
		        stmt = connection.createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        URL url1;
	        	 while (rs.next()) {
	        		 
	        		 String a = rs.getString("urls");
	        		 url1 = new URL(a);
	        		 urls.put(id,url1);
	        		 ++id;
			        }
	        	 
	        	
		    } catch (SQLException e ) {
		    	throw new IllegalStateException("problem!", e);
		    }  catch (MalformedURLException e) {
				System.out.println("unproper URL insertion");
		    } finally { if (stmt != null) { stmt.close(); }
		    }
		    
		    return urls; 
		    
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
	}
	
	
	
	
	
	
	

	
	
	
	
	public static HashMap<Integer,String> crawlHtml() {                 /*Η μέθοδος θα χειρίζεται τον crawler και θα επιστρεφει τα αποτελέσματα του σε μορφή */
		HashMap<Integer,String> map = new HashMap<>();						/*hashmap */
		return map;
	}

	
	
	
	public static HashMap<Integer,URL> returnUrls() throws MalformedURLException   {       /*not permanent, just a test method*/
		
		
		HashMap<Integer,URL> map = new HashMap<>();
		try {
			URL url1 = new URL("http://www.aeoliashop.gr/category/oil/");
			URL url2 = new URL("http://www.aeoliashop.gr/category/oil/page/2/");
			URL url3 = new URL("http://www.aeoliashop.gr/category/oil/page/3/");
			URL url4 = new URL("http://www.aeoliashop.gr/category/oil/page/4/");
		
			map.put(1,url1);
			map.put(2,url2);
			map.put(3,url3);
			map.put(4,url4);
		
		} catch (MalformedURLException e) {
			System.out.println("unproper URL insertion");
		} finally {} 
		
		
		
		return map;
		
	}
	
	
	
	
	
	
	
	

}
