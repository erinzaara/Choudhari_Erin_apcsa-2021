//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
	}

	public void add(Alien aln)
	{
		aliens.add(aln);
	}

	public void drawEmAll( Graphics window )
	{
		
		for (Alien aln : aliens) {
			aln.draw(window);
		}
		
	}

	public void moveEmAll()
	{
		for (Alien a : aliens) {
			a.move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < aliens.size(); i++) {
			for (Ammo am : shots) {
				if (am.collide(aliens.get(i))) {
					aliens.remove(i);
					i = 0;
					break;
				}
			}
		}
	}
	
	public int getSize() {
		return aliens.size();
	}

	public String toString()
	{
		String res = "";
		for (Alien aln : aliens) {
			res += aln;
		}
		return res;
	}
}
