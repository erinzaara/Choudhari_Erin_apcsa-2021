//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String word1 = keyboard.next();
		StringOddOrEven one = new StringOddOrEven(word1);
		System.out.println(word1 + " is " + one.toString());
		System.out.println("");
		
		out.print("Enter a word :: ");
		String word2 = keyboard.next();
		StringOddOrEven two = new StringOddOrEven(word2);
		System.out.println(word2 + " is " + two.toString());
		System.out.println("");
		
		out.print("Enter a word :: ");
		String word3 = keyboard.next();
		StringOddOrEven three = new StringOddOrEven(word3);
		System.out.println(word3 + " is " + three.toString());
		System.out.println("");
		
		out.print("Enter a word :: ");
		String word4 = keyboard.next();
		StringOddOrEven four = new StringOddOrEven(word4);
		System.out.println(word4 + " is " + four.toString());
		System.out.println("");
	}
}