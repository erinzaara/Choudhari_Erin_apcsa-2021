//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{	
		if (a != b){
			BigDecimal ans = new BigDecimal(Math.abs(a-b)).setScale(1,RoundingMode.HALF_UP);
			return ans.doubleValue();
		}
		return (a*b);
		
	}
}