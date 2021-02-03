//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		//assign variables
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		//calculate minutes in hour unit to compute rate (distance = rate*time)
		double hourmins = (double)minutes/60.00;
		double totalhours = (double) (hours + hourmins);

		mph = distance/totalhours;
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + (int) Math. round(mph) + " MPH.");
	}
}