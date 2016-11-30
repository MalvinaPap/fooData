import java.io.*;

public class Split {

	public static void getWords() {

		String str = "<meta name=\"keywords\" content=\"Åëáéüëáäï, ëÜäé, ÊáëáìÜôá, åîáéñåôéêÜ ðáñèÝíï åëáéüëáäï, ÐÏÐ ÊáëáìÜôáò, Åëáéï÷þñé\"";

		for (String retval: str.split("\"")) {
		         System.out.println(retval);
    		}

	}



	public static void main(String args[]) {

		getWords();

	}

}
