import java.io.*;

public class Split {

	public static void getWords() {

		String str = "<meta name=\"keywords\" content=\"Ελαιόλαδο, λάδι, Καλαμάτα, εξαιρετικά παρθένο ελαιόλαδο, ΠΟΠ Καλαμάτας, Ελαιοχώρι\"";

		for (String retval: str.split("\"")) {
		         System.out.println(retval);
    		}

	}



	public static void main(String args[]) {

		getWords();

	}

}
