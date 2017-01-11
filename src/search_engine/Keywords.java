package search_engine;

import java.sql.*;
import java.net.URL;
import java.util.*;


public class Keywords {
	
	/**Gets a Hashmap of urls, makes an arraylist with each ones' keywords
	 * 
	 * @return HashMap<Integer, ArrayList<String>>
	 * @throws SQLException
	 * @throws Exception
	 */
	
	public  HashMap<Integer, ArrayList<String>> findKeywords() throws SQLException, Exception {
		
		HashMap<Integer, URL> urls = new HashMap<Integer, URL>();
		HashMap<Integer, ArrayList<String> > keywords = new HashMap<Integer, ArrayList<String> >();
                //Gets the Hashmap with the links created in class Crawling
		urls = Crawling.getDatabase();
		
		String html = new String();

		for (int i = 1; i <= urls.size(); i++) {
			//use method getText from class HTMLreader in order to get HTML code of the link as a String
			html = HTMLreader.getText(urls.get(i)); 
			
			html = html.replace('"','\u20ac');
			html = html.replace('|', ',');
			html = html.replaceAll("\\s+", ",");

			String lines[] = html.split(">");   
		
			
			ArrayList<String> arrayWords = new ArrayList<String>();

			ArrayList<String> newwordsList = new ArrayList<String>();
			
			

			for (int y=0; y < lines.length; y++) {
			
				
				if (lines[y].startsWith("<meta,name=€keywords€,content=")||lines[y].startsWith(",<meta,name=€keywords€,content=")) {
					
					/* FIRST META TAG: KEYWORDS */
					String[] getLine= lines[y].substring(28).split("€");

					String[] words = getLine[1].split(",");
					
					newwordsList.addAll(Arrays.asList(words));
		
					arrayWords.addAll(newwordsList);
					
					newwordsList.clear();
					
				}

				if (lines[y].startsWith("<meta,name=€title€,content=")||lines[y].startsWith(",<meta,name=€title€,content=")) {

					/* SECOND META TAG: TITLE */
					String[] getLine = lines[y].substring(25).split("€");

					String[] words = getLine[1].split(",");
					newwordsList.addAll(Arrays.asList(words));

					arrayWords.addAll(newwordsList);
					newwordsList.clear();

				}
				if (lines[y].startsWith("<meta,name=€description€,content=")||lines[y].startsWith(",<meta,name=€description€,content=")) {

					/*THIRD META TAG: DESCRIPTION */
					String[] getLine = lines[y].substring(31).split("€");

					String[] words = getLine[1].split(",");
					newwordsList.addAll(Arrays.asList(words));

					arrayWords.addAll(newwordsList);
					newwordsList.clear();
					
				}
				
				
			} /* end for */
			
			keywords.put(i, arrayWords);
			
	    }/* end for */
		
	    return keywords;

	} /* end findKeywords() */

} /* end Keywords */
