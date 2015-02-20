package tutorial;
import java.util.Scanner;

public class randomTestDoNotConsider {
	public static void main(String Args[]){
		Scanner input = new Scanner(System.in);
		Scanner Henry = new Scanner(System.in);
	
		System.out.println("How old are you, buddy?");
		
		int age = input.nextInt();
		
		if (age > 20){
			System.out.println("Oh... You're life is all downhill from here, pal.");
			
			 if (age < 30){
				System.out.println("Eh, but at least you're not thirty yet.");}
		}
		else{
			System.out.println("Um.. You're just a strange age.");}	
		
	System.out.println("What's your name, buddy? :D");
	
	String name = Henry.nextLine().toString();
	
	System.out.println(name == "Rubin" ? "Eww, your name sucks..." : "That's a cool name you have there, " + name);
		}	
	}

