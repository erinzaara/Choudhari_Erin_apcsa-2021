//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid test = new Grid(20, 20, new String[]{"a", "b", "c", "7", "9", "x", "2"});
		
		System.out.println( test );
		System.out.println( test.findMax(new String[]{"a", "b", "c", "7", "9", "x", "2"}) );
	}
}