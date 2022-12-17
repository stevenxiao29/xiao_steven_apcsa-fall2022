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

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al : aliens) 
			al.draw(window);
	}

	public void moveEmAll()
	{
		for (Alien alien : aliens) {
			if (alien.getDirrection().equals("LEFT"))
			{
				if (alien.getX() - alien.getSpeed() <= 0) 
				{
					alien.setDirrection("RIGHT");
					alien.move("DOWN");
				}
			}
			else if (alien.getDirrection().equals("RIGHT")) 
			{
				if (alien.getX() + alien.getSpeed() >= 750) 
				{
					alien.setDirrection("LEFT");
					alien.move("DOWN");
				}
			}
			alien.move(alien.getDirrection());
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < shots.size(); i++) 
		{
			for (int j = 0; j < aliens.size(); j++) 
			{
				Alien alien = aliens.get(j);
					if (shots.get(i).getX() == alien.getX() && shots.get(i).getY() == alien.getY()) 
					{
						shots.remove(i);
						aliens.remove(j);
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
