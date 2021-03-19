//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy one = new Toy();
		one.setName("sorry");
		one.setCount(1);
		System.out.println(one.toString());
		one.setName("gi joe");
		one.setCount(5);
		System.out.println(one.toString());
	}
}