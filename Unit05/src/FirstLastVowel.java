//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String first = "" + a.charAt(0);
	   String last = "" + a.charAt(a.length()-1);
	   if (first.matches("[aieouAIEOU]") || last.matches("[aieouAIEOU]")) {
		   return "yes";
	   }
		return "no";
	}
}