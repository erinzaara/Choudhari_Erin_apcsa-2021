//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(150);
		setY(150);
		setW(10);
		setH(10);
		setColor(Color.black );

	}
	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		setX(x);
		setY(y);
		setW(10);
		setH(10);
		setColor(Color.black );
	}
	
	public Block(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setW(w);
		setH(h);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setX(x);
		setY(y);
		setW(w);
		setH(h);
		setColor(c);
	}
	
	
   //add the other set methods
	public void setX(int x){
		xPos = x;
	   }
	public void setY(int y){
		yPos = y;
	   }
	public void setPos(int x, int y){
		xPos = x;
		yPos = y;
	   }
	public void setW(int w){
		width = w;
	   }
	public void setH(int h){
		height = h;
	   }
   public void setColor(Color col){
	   color = col;
	   }

   
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block compare =  (Block) obj;
		
		return (getX() == compare.getX() && getY() == compare.getY() && 
			getWidth() == compare.getWidth() && getHeight() == compare.getHeight() &&
			getColor() == compare.getColor());
	}   

   //add the other get methods
	public int getX(){
		return xPos;
	   }
	public int getY(){
		return yPos;
	   }
	public int getWidth(){
		return width;
	   }
	public int getHeight(){
		return height;
	   }
   public Color getColor(){
	   return color;
	   }
    
   //add a toString() method  - x , y , width, height, color
   public String toString() {
	   return xPos + " " + yPos + " " + width + " " + height + " " + color;
   
   }
}