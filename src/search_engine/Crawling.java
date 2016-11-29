
package search_engine;

import java.util.HashMap;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.net.MalformedURLException;

/**
 *
 *
 */
public class Crawling {

/*constructor*/
	public Crawling() {
	}




	public static HashMap<Integer,URL> crawlUrl() {                     /*Η μέθοδος θα χειρίζεται τον crawler και θα επιστρεφει τα αποτελέσματα του σε μορφή */
		                                                                /*hashmap */
		HashMap<Integer,URL> map = new HashMap<>();
		return map;
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
