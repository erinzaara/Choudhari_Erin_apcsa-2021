//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare test1 = new WordsCompare("abe","ape");
	   System.out.println(test1);
	   
	   WordsCompare test2 = new WordsCompare("giraffe","gorilla");
	   System.out.println(test2);
	   
	   WordsCompare test3 = new WordsCompare("one","two");
	   System.out.println(test3);
	   
	   WordsCompare test4 = new WordsCompare("fun","funny");
	   System.out.println(test4);
	   
	   WordsCompare test5 = new WordsCompare("123","19");
	   System.out.println(test5);
	   
	   WordsCompare test6 = new WordsCompare("193","1910");
	   System.out.println(test6);
	   
	   WordsCompare test7 = new WordsCompare("goofy","godfather");
	   System.out.println(test7);
	   
	   WordsCompare test8 = new WordsCompare("funnel","fun");
	   System.out.println(test8);
	

	  
	}
}