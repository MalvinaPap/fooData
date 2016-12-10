package search_engine;

import java.net.MalformedURLException;
import java.net.URL;

public class HTMLreader_test {

	public static void main(String[] args) throws MalformedURLException {
		
		try {	
			URL url = new URL("http://www.grecofarm.com/product/xaroupomelo-250ml/");
			String html = HTMLreader.getText(url);
			System.out.println(html);
		}  catch (MalformedURLException e) {
			System.out.println("unproper URL insertion");
	    } catch (Exception a) {}
	}

}
