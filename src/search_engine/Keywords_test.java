package search_engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.sql.SQLException;

public class Keywords_test {
	
	public static void main(String args[]) {
			
		try{
			Keywords keys = new Keywords();
	
			HashMap<Integer, ArrayList<String> > keywords = keys.findKeywords();
			for (int i=1 ; i<=keywords.size(); i++) {
				for (int j=0 ; j<keywords.get(i).size(); j++) {
					System.out.println(keywords.get(i).get(j));
				}
			}
		}catch (SQLException e) {
		}catch (Exception a) {}
		
		
	}
}
