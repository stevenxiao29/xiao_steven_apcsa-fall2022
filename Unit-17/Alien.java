//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private String direction;
	private boolean isAlive;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x, y, 30, 30, 5);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 30, 30, s);

	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		
		isAlive = true;
		try
		{
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("hi tony mauro");//feel free to do something here
		}
	}
	
	public boolean getAlive() {
		return isAlive;
	}
	
	public void setAlive(boolean val) {
		isAlive = val;
	}
	
	public void setDirrection(String dir) {
		direction = dir;
	}
	
	public String getDirrection() {
		return direction;
	}

	public void setSpeed(int s)
	{
		speed=s;
	}

	public int getSpeed()
	{
	   return 0;
	}

//   public void move(String direction)
//	{
//	   //add code here
//	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
