package tutorial;
import java.util.Scanner;



public class FactorNums {
	public static void main (String args[]){
		System.out.println("Pick an integer:");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int f;
		
		for (f = 1; f < num / 2 + 1 ; f ++){
			if (num / f * f == num){
				System.out.println(f);
			}
		}
		System.out.println(num);
		
		
	}
	
}
