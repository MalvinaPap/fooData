/**
 * 
 */
package search_engine;

import java.util.Scanner;

/**
 * @author Malvina
 *
 */
public class Inputs {

	/**
	 * 
	 */
	public Inputs() {
		// TODO Auto-generated constructor stub
	}
	
	public String input() {
		String keyword;	
		
		
			
		System.out.println("keywords or 'end' to terminate");	/*παιρνει παντα το end για keyword*/
		@SuppressWarnings("resource")	
		Scanner input = new Scanner(System.in);
		keyword = input.next();
		
		
		return keyword;
	}
	
}
