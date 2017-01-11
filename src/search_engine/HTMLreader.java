package search_engine;

import java.net.*;
import java.io.*;


public class HTMLreader {

        /**Gets a URL and returns the first 2500 characters
         * of its HTML code as a String
         * @param url
         * @return String
         * @throws Exception
         */
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
            //to Lower case-stemming for capital and non-capital letters
            return response.toString().substring(0,2500).toLowerCase();
        }




}
