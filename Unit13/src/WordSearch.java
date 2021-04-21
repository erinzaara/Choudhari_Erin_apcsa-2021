//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	for (int i = 0; i < size; i++) {
    		m[i] = str.substring(size * i, size * i + 8).split("");
    	}
    }

    public boolean isFound( String word )
    {
    	boolean found = false;
    	
    	for (int i = 0; !found && i < m.length; i++){
    		for (int j = 0; !found && j < m.length; j++){
    			if (word.substring(0,1).equals(m[i][j])){
    				found = checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownLeft(word, i, j) || checkDiagDownRight(word, i, j);
    			}
    		}
    	}
    	
    	return found;

    }

	public boolean checkRight(String w, int r, int c)
   {
		int index = 0;
		
		while (index < w.length()){
			if (c+index < 0 || c+index >= m.length)
				return false;
			if (!w.substring(index,index+1).equals(m[r][c+index]))
				return false;
			index = index +1;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int index = 0;
		
		while (index < w.length()){
			if (c-index < 0 || c-index >= m.length)
				return false;
			if (!w.substring(index,index+1).equals(m[r][c-index]))
				return false;
			index = index +1;
		}
		return true;

	}

	public boolean checkUp(String w, int r, int c)
	{
		int index = 0;
		
		while (index < w.length())
		{
			if (r-index < 0 || r-index >= m.length)
				return false;
			if (!w.substring(index,index+1).equals(m[r-index][c]))
				return false;
			index = index +1;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int index = 0;
		
		while (index < w.length())
		{
			if (r+index < 0 || r+index >= m.length)
				return false;
			if (!w.substring(index,index+1).equals(m[r+index][c]))
				return false;
			index = index +1;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int index = 0;
		
		while (index < w.length())
		{
			if (r-index < 0 || r-index >= m.length || c+index < 0 || c+index >= m.length)
				return false;
			if (!w.substring(index,index+1).equals(m[r-index][c+index]))
				return false;
			index = index +1;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int index = 0;
		
		while (index < w.length())
		{
			if (r-index < 0 || r-index >= m.length || c-index < 0 || c-index >= m.length)
				return false;
			if (!w.substring(index,index+1).equals(m[r-index][c-index]))
				return false;
			index = index +1;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int index = 0;
		
		while (index < w.length())
		{
			if (r+index < 0 || r+index >= m.length || c-index < 0 || c-index >= m.length)
				return false;
			if (!w.substring(index,index+1).equals(m[r+index][c-index]))
				return false;
			index = index +1;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int index = 0;
		
		while (index < w.length())
		{
			if (r+index < 0 || r+index >= m.length || c+index < 0 || c+index >= m.length)
				return false;
			if (!w.substring(index,index+1).equals(m[r+index][c+index]))
				return false;
			index = index +1;
		}
		return true;
	}

    public String toString()
    {
    	String res = "";
    	
    	for (String[] r : m){
    		for (String c : r) {
    			res += c + " ";
    		}
    		
    		res += "\n";
    	}
    	
 		return res;
    }
}
