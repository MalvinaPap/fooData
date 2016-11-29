package search_engine;



import java.net.URL;
import java.util.HashMap;
import java.net.MalformedURLException;
import java.util.Scanner;



public class CrawlingTest {

	public static void main(String args[]) {
	
		try {
			HashMap<Integer,URL> map = new HashMap<>();
			map = Crawling.returnUrls();
			Scanner inp = new Scanner(System.in);
			System.out.println("Give url key:" );
			int key= inp.nextInt();
			System.out.println(map.get(key));
			
			
		} catch (MalformedURLException e) {
			System.out.println("unproper URL insertion");
		} finally {} 
	}
	
	
}
