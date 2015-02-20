/* You need to find a way to sort the variables.
 * Once ans has been inserted once, it does not change. We need that to be fixed.
 */

package tutorial;
import java.util.Scanner;


public class PresQ {
	public static void main(String args[]){
		System.out.println("Who is the president of 2015?");
		Scanner input = new Scanner (System.in);
		String ans1 = ("Obama");
	
		
		while(true){
			
			String guess = input.nextLine().toString();
			
			if (guess.equals(ans1)){
				System.out.println("You are correct!");}
			else{
				System.out.println("Try again.");
				
				System.out.println("Who is the president of 2015?");
			}
				
	
			
		}
		
		
		}
		
	}


