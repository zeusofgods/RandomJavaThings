package tutorial;
import java.util.Scanner;
public class PresQ3 {
	public static void main(String Args[]){
		
	System.out.println("Who is the president of 2015?");
	Scanner input = new Scanner (System.in);
	
	
	while (true){
	String guess = input.nextLine().toString();
	
	switch(guess){
	
	case "Barack Obama":
	case "Obama":
	case "obama":
	case "barack obama":
	case "barack":
	case "Barack obama":
		System.out.println("You're right!");
		System.exit(0);
		break;
	default:
		System.out.println("Try again.");
			
	}
	}
}
}