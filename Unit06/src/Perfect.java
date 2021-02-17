//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;

public class Perfect
{
   private int number;
   private int sum;

   public Perfect()
	{
	   setNum(0);
	}

	public Perfect(int x)
	{
		setNum(x);
	}

	public void setNum(int x)
	{
		number = x;
	}

	public boolean isPerfect()
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		sum = 0;
		
		for (int i = number-1; i > 0; i --) {
			if (number % i == 0) {
				nums.add(i);
			}
		}
		
		for (int i : nums)
	         sum = sum + i;
		
		return sum == number;
	}

	public String toString()
 	{
		if (isPerfect()) {
			return number + " is a perfect number.";
		}
		return number + " is not a perfect number.";
	}	
	
}