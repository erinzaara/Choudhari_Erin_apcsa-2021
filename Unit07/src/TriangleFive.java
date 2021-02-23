//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		this((char)0 , 0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount (amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output = "";
		
		for (int x = 0; x < amount; x++){
			char current = letter;

			for (int y = 0; y < amount - x; y++){
				
				for (int z = 0; z < amount - y; z++){
					output += current;
				}
				output += " ";
				
				if (current == 'Z')
					current = 'A';
				else 
					current++;
			}
			output += '\n';
		}
		
		return output;
	}
}