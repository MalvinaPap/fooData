package search_engine;

import java.net.*;
import java.io.*;


public class HTMLreader {

    
        public static String getText(URL url) throws Exception {
            URLConnection connection = url.openConnection();
            BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                        connection.getInputStream()));

            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) 
                response.append(inputLine);

            in.close();

            return response.toString().substring(0,3000);
        }

        
    

}
