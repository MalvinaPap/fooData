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
		
		do{
			
			System.out.println("keywords or 'end' to terminate");	
			@SuppressWarnings("resource")	
			Scanner input = new Scanner(System.in);
			keyword = input.next();
		}while(!keyword.equals("end"));
		
		return keyword;
	}
	
}
