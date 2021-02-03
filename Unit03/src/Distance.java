//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{	
		setCoordinates(0,0,0,0);
		distance = 0.0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		//asign variables
		xOne = (x1);
		yOne = (y1);
		xTwo = (x2);
		yTwo = (y2);
	}

	public void calcDistance()
	{
		//use equation distance = sqrt(y2-y1)^2 * (x2-x1)^2)
		double dist = ((yTwo-yOne)*(yTwo-yOne))+((xTwo-xOne)*(xTwo-xOne));
		distance = sqrt(dist);
	}
	
	private double sqrt(double distance) {
		return Math.sqrt(distance);
	}

	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		System.out.printf("distance == %.3f %n",distance);
	}

	
}