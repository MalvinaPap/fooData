
package search_engine;

import java.util.Scanner;

public class Inputs {

	/** Requires an input from the user till input is 'end' 
	 * @return String
	 * 
	 */
	public Inputs() {	
	}
	
	public String input() {
		String keyword;	
			
		System.out.println("keywords or 'end' to terminate");	
		@SuppressWarnings("resource")	
		Scanner input = new Scanner(System.in);
		keyword = input.next();
		
		
		return keyword;
	}
	
}
