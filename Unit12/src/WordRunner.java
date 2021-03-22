//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;


public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		
		Comparable<Word>[] list = new Word[size];
		
		for (int i=0; i<size; i++)
		{
			String word = file.next();
			list[i] = new Word(word);

		}
		
		
		for (int x = 0; x < size; x++){
			for (int y = 0; y < size-1; y++){
				int value = list[y].compareTo((Word)list[y + 1]);
		
				if (value > 0){
					Word placeHolder = (Word) list[y+1];
					list[y+1] = list[y];
					list[y] = placeHolder;
				}
			}
		}
		
		for (int i=0; i<size; i++) {
			System.out.println(list[i]);
		}

	}
}