
package search_engine;

import java.util.HashMap;
import java.net.URL;
import java.net.MalformedURLException; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Crawling {

    /**constructor*/	
	public Crawling() {
	}
	
	/** Gets the links from mySql database and puts them in a Hashmap
	 * @return HashMap<Integer,URL>
	 * @throws SQLException
	 * @throws MalformedURLException
	 */
	public static HashMap<Integer,URL> getDatabase() throws SQLException, MalformedURLException {
		
		String url = "jdbc:mysql://195.251.249.131:3306/ismgroup37";
		String username = "ismgroup37";
		String password = "dxodtb";
		int id = 1;

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		    Statement stmt = null;
		    String query = "SELECT * FROM urls u;";
		    HashMap<Integer,URL> urls = new HashMap<>();
		    try {
		        stmt = connection.createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        URL url1;
	        	 while (rs.next()) {
	        		 
	        		 String a = rs.getString("url");
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
	

}
