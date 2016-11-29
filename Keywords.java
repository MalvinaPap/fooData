import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ArrayList;

public class Keywords {

	Hashmap<Integer, URL> urls = new Hashmap<Integer, URL>();

	HTMLreader crawling_html = new HTMLreader;

	Hashmap<Integer, URL> keywords = new Hashmap<Integer, URL>();

	public HashMap<Integer, URL> findKeywords(String url) {

		ArrayList listOfKeys = new ArrayList;

		for (i = 0; i <= urls.size(); i++) {

			html = crawling_html.readURL(urls.get(i));

			if (html.toLowerCase().startsWith("<meta ")) {

				if (html.toLowerCase().matches("name="description" content=") ||
					html.toLowerCase().matches("name="description" content=") ||
					html.toLowerCase().matches("name="keywords" content=") {

					keywords = ;  /* εδω παιρνουμε τα keywords απο τα strings
									 που επαληθεουν τις παραπανω συνθηκες */

				} /* end if */

			} /* end if */

			keywords.put(i, keywords);
	    } /* end for */

	    return keywords;

   } /* end findKeywords() */

} /* end Keywords */