//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String name;
	private int size;
	
	public Skeleton(){
		name = "Bob";
		size = 2;
	}
	
	public Skeleton(String x, int y){
		name = x;
		size = y;
	}

	public int getHowBig()
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)
	{
		if (this.getHowBig() > other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(Monster other)
	{
		if (this.getHowBig() < other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	public boolean namesTheSame(Monster other)
	{
		if (this.getName().equals(other.getName())) {
			return true;
		}
		return false;
	}

	public String toString(){
		String result = this.getName() + " " + this.getHowBig();
		return result;
	}
}