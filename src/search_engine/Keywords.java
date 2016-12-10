package search_engine;

import java.sql.*;
import java.net.URL;
import java.util.*;

public class Keywords {

	HashMap<Integer, URL> urls = new HashMap<Integer, URL>();
	HashMap<Integer, ArrayList<String> > keywords = new HashMap<Integer, ArrayList<String> >();

	
	 
	
	public HashMap<Integer, ArrayList<String>> findKeywords() throws SQLException, Exception {

		urls = Crawling.getDatabase();
		
		String html = new String();

		for (int i = 1; i <= urls.size(); i++) {

			html = HTMLreader.getText(urls.get(i));
			html = html.replace('"', '€');
			html = html.replaceAll("\\s+", "");

			String lines[] = html.split("/>");
			ArrayList<String> arrayWords = new ArrayList<String>();

			ArrayList<String> newwordsList = new ArrayList<String>();
			
			/*for (int w=0;w<lines.length;w++) {
				System.out.println(lines[w]);
			}*/

			for (int y=0; y < lines.length; y++) {
			

				if (lines[y].startsWith("<metaname=€keywords€content=")) {
					

					/* FIRST META TAG: KEYWORDS */
					String[] getLine = lines[y].substring(28).split("€");

					String[] words = getLine[0].split(",");
					for (int w=0;w < words.length;w++) {
						System.out.println(words[w]);
					}
					
					newwordsList.addAll(Arrays.asList(words));
		
					arrayWords.addAll(newwordsList);
					newwordsList.clear();
					
					

				}

				/*if (lines[y].startsWith("<meta name=€title€ content=")) {

					 SECOND META TAG: TITLE 
					String[] getLine = lines[y].substring(7).split("€");

					String[] words = getLine[0].split(",");
					newwordsList.addAll(Arrays.asList(words));

					arrayWords.addAll(newwordsList);
					newwordsList.clear();

				}
				if (lines[y].startsWith("<meta name=\"description\" content=")) {

					 THIRD META TAG: DESCRIPTION 
					String[] getLine = lines[y].substring(34).split("€");

					String[] words = getLine[0].split(",");
					newwordsList.addAll(Arrays.asList(words));

					arrayWords.addAll(newwordsList);
					newwordsList.clear();
				}

				if (lines[y].startsWith("<title>")) {

					 FORTH TAG: TITLE 
					String[] getLine = lines[y].substring(7).split("€");

					String[] words = getLine[0].split(",");
					newwordsList.addAll(Arrays.asList(words));

					arrayWords.addAll(newwordsList);
					newwordsList.clear();
				} */


			} /* end for */
			
			keywords.put(i, arrayWords);

		}/* end for */
		
	    return keywords;

	} /* end findKeywords() */

} /* end Keywords */
