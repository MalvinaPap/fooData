package search_engine;
import java.net.*;
import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.HashMap;

public class HTMLreader {


    public String readURL(URL url) throws Exception {

			String htmlcontent = null;
			URLConnection con = null;

			try {
				Scanner scanner = new Scanner(con.getInputStream());
				scanner.useDelimiter("\\Z");
				htmlcontent = scanner.next();
			}catch ( Exception ex ) {
				ex.printStackTrace();
			}

			return htmlcontent;
    }

}
