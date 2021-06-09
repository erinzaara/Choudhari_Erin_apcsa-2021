//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private boolean alive;

	public Ammo()
	{
		this(5,5,5);
	}

	public Ammo(int x, int y)
	{
		this(x,y,5);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		alive = true;
		speed = s;
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), 10, 10);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if (direction.equals("UP")) {
            setY(super.getY() - speed);
        }
        if (direction.equals("DOWN")) {
            setY(super.getY() + speed);
        }
        if (direction.equals("RIGHT")) {
            setX(getX() + speed);
        }
        if (direction.equals("LEFT")) {
            setX(getX() - speed);
        }
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
	
	public boolean collide(Alien aln) {
		if (getX() + 10 >= aln.getX() && getX() <= aln.getX() + aln.getWidth()
				&& getY() - 10 >= aln.getY()
				&& getY() <= aln.getY() + aln.getHeight()) {
			alive = false;
		return true;
		} else {
			return false;
		}
	}
	
	public boolean isAlive() {
		if (getY() < 0) {
			alive = false;
		}
		return alive;
	}
}
