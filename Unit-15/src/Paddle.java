//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   
   private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;


   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors


   public Paddle(int x, int y)
   {
	   xPos	= x;
	   yPos = y;
   }

   public Paddle(int x, int y, int s)
   {
	   xPos	= x;
	   yPos = y;
	   speed = s;
   }
   
   public Paddle(int x, int y, int s, int wid, int ht)
   {
	   xPos	= x;
	   yPos = y;
	   width = wid;
	   height = ht;
	   speed = s;
   }

   public Paddle(int x, int y, int wid, int ht, Color col, int s)
   {
	   xPos	= x;
	   yPos = y;
	   width = wid;
	   height = ht;
	   color = col;
	   speed = s;
   }




   public void moveUpAndDraw(Graphics window)
   {
	   

   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   public String toString()
   {
	   return "xPos: " + xPos + "\nyPos: " + yPos + "\nwidth: " + width + "\nheight: " + height + "\nspeed: " + speed + "\n";  
   }
   
   //add a toString() method
}