package tutorial;
//Need to fix: Does not give accurate answers. Rounds to nearest WHOLE number. Please make it round to nearest Double.
//Is there a way to loop the program so you can use the calculator multiple times without having to restart?
import java.util.Scanner;
public class TestCalc {
	public static void main(String args[]){
		Scanner Calc = new Scanner (System.in);
		Scanner Op = new Scanner (System.in);
		double fnum, snum, answer;
		String operation;
		double rnd;
		
		System.out.println("Hey there! Welcome to the Calculator!");
		System.out.println("When inputting numbers and operations, please remember not to use spaces!");
		System.out.println(" ");
		System.out.println("Enter first number:");
		fnum = Calc.nextDouble();
		
		System.out.println("What operation?");
		System.out.println("+  -  *  / ");
		operation = Op.nextLine();
		
		System.out.println("Enter second number:");
		snum = Calc.nextDouble();
		
		switch (operation){
		case "Multiply":
		case "Multiplication":
		case "multiplication":
		case "multiply":
		case "multiply by":
		case "Multiply by":
		case "*":
		case "Times":
		case "times":
			answer = fnum * snum;
			rnd = Math.round(answer);
			System.out.print("Your answer = " + rnd + ("!"));
			break;
			
		case "Divide":
		case "divide":
		case "divided by":
		case "Divided by":
		case "Division":
		case "division":
		case "/":
		case "over":
		case "Over":
			answer = fnum / snum;
			rnd = Math.round(answer);
			System.out.print("Your answer = " + rnd + ("!"));
			break;
			
		case "Subtract":
		case "subtract":
		case "Subtraction":
		case "subtraction":
		case "-":
		case "minus":
		case "Minus":
			answer = fnum - snum;
			rnd = Math.round(answer);
			System.out.print("Your answer = " + rnd + "!");
			break;
			
		case "Add":
		case "add":
		case "Addition":
		case "addition":
		case "+":
		case "Plus":
		case "plus":
			answer = fnum + snum;	
			rnd= Math.round(answer);
			System.out.print("Your answer = " + rnd + "!");
			break;
			
		default:
			System.out.println("Syntax Error");

		}
	}
	}