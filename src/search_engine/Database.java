/**
 * 
 */
package search_engine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Malvina
 *
 */
public class Database {

	/**
	 * 
	 */
	public Database() {
		// TODO Auto-generated constructor stub
	}

	
	public List<String> selection(String input) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/searchengine";
		String username = "root";
		String password = "123456789";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		    Statement stmt = null;
		    String query = "SELECT pa.url FROM searchengine.url pa inner join searchengine.keywords a on pa.id = a.id_url  where a.keywords ='"+input+"'";
		    List<String> test = new ArrayList<String>(); 
		    try {
		        stmt = connection.createStatement();
		        ResultSet rs = stmt.executeQuery(query);
		        
	        	 while (rs.next()) {
	        		 test.add(rs.getString("url"));
			        }
	        	 return test;
		        
		       
		    } catch (SQLException e ) {
		    	throw new IllegalStateException("problem!", e);
		    } finally {
		        if (stmt != null) { stmt.close(); }
		    }
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
	}
}
