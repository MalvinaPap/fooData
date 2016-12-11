package search_engine;

import java.util.HashMap;
import java.util.ArrayList;

public class Indexing {

	SampleKeys kwd = new SampleKeys();

	HashMap<Integer, ArrayList<String>> hash = kwd.findKeywords();

	HashMap<String, ArrayList<Integer>> index = new HashMap<String, ArrayList<Integer>>();



	public HashMap<String, ArrayList<Integer>> getTable() {

		int i = 1;
		int end = hash.size();

		ArrayList<String> array = new ArrayList<String>();


		while(i <= end) {  //end=3

			array = hash.get(i);

			for (int x = 0; x < array.size(); x++) {
				ArrayList<Integer> ids = new ArrayList<Integer>();

				if (index.containsKey(array.get(x))) {
					index.get(array.get(x)).add(i);
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
