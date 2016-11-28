/**end
 * 
 */
package search_engine;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Malvina
 *
 */
public class Search {

	/**
	 * 
	 */
	public Search() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		
		Inputs userInput = new Inputs();
		String keyword = userInput.input();
		
		Database database = new Database();
		List<String> res = database.selection(keyword);
		if(res.size()>0){
			for (int i = 0; i < res.size(); i++) {
				System.out.println(res.get(i));
			}
		}
		else{
			System.out.println("The keyword you inserted does not match");
		}
		
	}

}
