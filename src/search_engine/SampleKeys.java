//package index;

import java.util.HashMap;
import java.util.ArrayList;

public class SampleKeys {

	static HashMap<Integer, ArrayList<String>> hash = new HashMap<Integer, ArrayList<String>>();

	static ArrayList<String> arraylist1 = new ArrayList<String>();
	static ArrayList<String> arraylist2 = new ArrayList<String>();
	static ArrayList<String> arraylist3 = new ArrayList<String>();

	public static HashMap<Integer, ArrayList<String>> findKeywords() {

		arraylist1.add("k1");
		arraylist1.add("k2");
		arraylist1.add("k3");
		hash.put(1, arraylist1);

		arraylist2.add("k2");
		arraylist2.add("k4");
		hash.put(2, arraylist2);

		arraylist3.add("k2");
		arraylist3.add("k3");
		arraylist3.add("k5");
		hash.put(3, arraylist3);


		return hash;

		// ΠΡΟΣΟΧΗ!! κάθε φορά που καλείται η μέθοδος γεμιίζει πάλι το arraylist
	}

	public HashMap<Integer, ArrayList<String>> getKeywords() {

		return hash;
	}

}
