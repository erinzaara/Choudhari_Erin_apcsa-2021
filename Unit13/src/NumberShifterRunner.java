//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] arr1 = NumberShifter.makeLucky7Array(5);
		System.out.println(Arrays.toString(arr1));
		NumberShifter.shiftEm(arr1);
		System.out.println(Arrays.toString(arr1) + "\n");
		
		int[] arr2 = NumberShifter.makeLucky7Array(10);
		System.out.println(Arrays.toString(arr2));
		NumberShifter.shiftEm(arr2);
		System.out.println(Arrays.toString(arr2) + "\n");
		
		int[] arr3 = NumberShifter.makeLucky7Array(15);
		System.out.println(Arrays.toString(arr3));
		NumberShifter.shiftEm(arr3);
		System.out.println(Arrays.toString(arr3) + "\n");
	}
}



