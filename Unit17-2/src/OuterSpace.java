//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OuterSpace extends JPanel implements KeyListener, Runnable {
	private Ship ship;
	private Alien a1;
	private Alien a2;
	private Ammo a;

	private AlienHorde horde;
	private Bullets shots;

	private boolean[] keys;
	private BufferedImage back;
	
	private int score;
	private boolean fired;
	private boolean make_aliens;
	
	
	boolean RUNNING;

	public OuterSpace(JFrame par) {
		keys = new boolean[5];
		
		RUNNING = true;
		make_aliens = true;

		setBackground(Color.black);

		ship = new Ship(350, 400, 2);
		//a1 = new Alien (200,200,2);
		//a2 = new Alien (400,200,2);
		horde = new AlienHorde(10);
		shots = new Bullets();

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

	public void update(Graphics window) {

		paint(window);
	}

	public boolean collision() {

		return false;
	}


   public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		if (make_aliens==true) {
			int xPos = 150;
			for (int i = 0; i < 10; i++) {
				horde.add(new Alien(xPos, 50, 1));
				xPos += 50;
				}
			make_aliens = false;
		}
		

		if(keys[0] == true) {
			ship.move("LEFT");
		}
		//add code to move Ship, Alien, etc.
		if (keys[1] == true) {
            ship.move("RIGHT");
        }
        if (keys[2] == true) {
            ship.move("UP");
        }
        if (keys[3] == true) {
            ship.move("DOWN");
        }
        if (keys[4] == true) {
        	shots.add(new Ammo((ship.getX() + ship.getWidth() / 2) - 5, ship.getY() - 5, 5));
        	fired = false;
        }
   
        
        //a1.draw(graphToBack);
        //a2.draw(graphToBack);
        ship.draw(graphToBack);
        horde.drawEmAll(graphToBack);
        shots.drawEmAll(graphToBack);
		shots.moveEmAll();
        horde.moveEmAll();
        
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
        horde.removeDeadOnes(shots.getList());

		twoDGraph.drawImage(back, null, 0, 0);
		back = null;
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
			fired = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}