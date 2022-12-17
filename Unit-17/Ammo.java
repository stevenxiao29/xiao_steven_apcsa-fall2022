//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private boolean shot;

    /**
     * Default constructor that sets position to (0,0) and speed to 0
     */
	public Ammo()
	{
		this(0,0,0);
	}
	
	
	public Ammo(int x, int y)
	{
		this(x, y, 3); //add code
	}
	
	
	public Ammo(int x, int y, int s)
	{
		super(x, y, 5, 10);
	     setSpeed(s);
	     shot=true;
	}
	public void setSpeed(int s)
	{
		speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public boolean isShot() {
		return shot;
	}
	
	public void draw( Graphics window )
	{
		//System.out.println("ammo");
		window.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
	
	
	public void move( String direction )
	{
		//System.out.println("ammo move");

		this.setY(this.getY() - this.getSpeed());
	}

	public String toString()
	{
		return "";
	}
}
