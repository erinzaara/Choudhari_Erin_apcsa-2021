//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		//case 1
		out.print("Enter a whole number :: ");
		int num1 = keyboard.nextInt();
		
		System.out.println(num1 + " is odd :: " + NumberVerify.isOdd(num1));
		System.out.println(num1 + " is even :: " + NumberVerify.isEven(num1));
		System.out.println("");
		
		//case 2
		out.print("Enter a whole number :: ");
		int num2 = keyboard.nextInt();
		System.out.println(num2 + " is odd :: " + NumberVerify.isOdd(num2));
		System.out.println(num2 + " is even :: " + NumberVerify.isEven(num2));
		System.out.println("");
		
		//case 3
		out.print("Enter a whole number :: ");
		int num3 = keyboard.nextInt();
		System.out.println(num3 + " is odd :: " + NumberVerify.isOdd(num3));
		System.out.println(num3 + " is even :: " + NumberVerify.isEven(num3));
		System.out.println("");
	}
}