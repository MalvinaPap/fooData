package search_engine;

import java.lang.NullPointerException;

public class TestIndexing {

	public static void main(String[] args) {
		SampleKeys test = new SampleKeys();
		Indexing test2 = new Indexing();

		try {
			System.out.println(test.getKeywords());
			System.out.println();

			System.out.println(test2.getTable());
		} catch (NullPointerException e) {
			System.out.println("no filled hasmap");

		} catch (Exception e) {
			System.out.println("");
		}



	}


}
