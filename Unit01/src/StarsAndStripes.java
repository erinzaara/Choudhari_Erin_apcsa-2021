//© A+ Computer Science
//www.apluscompsci.com

//Name - Erin Choudhari
//Date - 1/27/21
//Class - Period 4
//Lab  - Unit 1 Stars and Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public static void printTwentyStars()
   {
	   out.println("********************");
   }

   public static void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public static void printTwoBlankLines()
   {
	   out.println("\n\n" );
   }
   
   public static void printASmallBox()
   {	
	  for (int i = 0; i < 3; i++) {
		  printTwentyDashes();
		  printTwentyStars();
	   }
	  printTwentyDashes();
   }
 
   public static void printABigBox()
   { 	
	   printASmallBox();
	   printASmallBox();
   } 
   
   //extra credit part
   public static void printTwentyStarsAndDashes()
   { 	
	   out.println("**********----------");
   } 
   
   public static void printAFlag()
   { 
	   for (int i = 0; i < 4; i++) {
			  printTwentyStarsAndDashes();
	   	   }
	   for (int i = 0; i < 4; i++) {
			  printTwentyDashes();
		   }
   } 
   //end of extra credit part
   
   public static void main(String[] args)
	{
	   printASmallBox();
	   printTwoBlankLines();
	   printABigBox();
	   printTwoBlankLines();
	   printAFlag();
	
	}
}
