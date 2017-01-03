package search_engine;

import java.util.HashMap;
import java.sql.SQLException;
import java.util.ArrayList;

public class Indexing {

    /** Creates the index that matches keywords with the urls they are found
     * 
     * @return HashMap<String, ArrayList<Integer>>
     * @throws SQLException
     * @throws Exception
     */
	public HashMap<String, ArrayList<Integer>> getTable() throws SQLException, Exception {
		
		Keywords kwd = new Keywords();

		HashMap<Integer, ArrayList<String>> hash = kwd.findKeywords();
	    HashMap<String, ArrayList<Integer>> index = new HashMap<String, ArrayList<Integer>>();

		int i = 1;
		int end = hash.size();

		ArrayList<String> array = new ArrayList<String>();


		while(i <= end) {  

			array = hash.get(i);

			for (int x = 0; x < array.size(); x++) {
				if (array.get(x).equals("και")||array.get(x).equals("ο")||array.get(x).equals("η")||array.get(x).equals("το")||array.get(x).equals("για")) {
					continue;
				}
				ArrayList<Integer> ids = new ArrayList<Integer>();

				if (index.containsKey(array.get(x))) {
					if (!index.get(array.get(x)).contains(i)) {
						index.get(array.get(x)).add(i);
					}
				} else {
					if (ids.contains(i)) {
						index.put(array.get(x), ids);
					} else {
						ids.add(i);
						index.put(array.get(x), ids);
					}
				}

		    }

		    i++;
		}

		return index;
	}

}