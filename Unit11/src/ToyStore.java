//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] eachToy = toys.split(" ", 0);
		int originalSize = toyList.size();

		//add all toys to list 
		for (int i =0;  i<eachToy.length;  i++){
			int count = 0;
			for (int j = 0; j<eachToy.length; j++){
				if (eachToy[i].equals(eachToy[j])){
					count += 1;
				}
			}
			
			toyList.add(new Toy(eachToy[i], count));
		}


		//update counts 
		for (int k = 0; k<originalSize; k++){
			for (int m = originalSize; m<toyList.size(); m++){
				if (toyList.get(k).getName().equals(toyList.get(m).getName())){
					toyList.get(k).setCount(toyList.get(k).getCount()+toyList.get(m).getCount());
		}
					}
				}

		//delete duplicates
		for (int x = 0; x < toyList.size(); x++){		
			for (int y = x+1; y < toyList.size(); y++){
				if (toyList.get(x).getName().equals(toyList.get(y).getName())){
					toyList.remove(y);
					y = y-1;
						}
					}
				}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i++)
  		{
  			if (toyList.get(i).getName() == nm)
  				return toyList.get(i);
  		}
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy most = toyList.get(0);
  		
  		for (int i = 1; i < toyList.size(); i++)
  		{
  			if (toyList.get(i).getCount() > most.getCount())
  				most = toyList.get(i);
  		}
  		return most.getName();
  	}  
  
  	  
	public String toString()
	{
		if (toyList.size() == 0)
  			return "[]";

		String str = "";	
  	
		for (int i = 0; i < toyList.size(); i++){
			str += toyList.get(i).getName() + " " + toyList.get(i).getCount() + ", ";
		}
		return str;

	}
}