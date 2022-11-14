
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
   public void setSpeed(int s) {
	   speed = s;
   }

   public boolean equals(Object obj)
	{

		return this.height == ((Paddle)obj).height && 
				this.xPos == ((Paddle)obj).xPos && 
				this.yPos == ((Paddle)obj).yPos &&
				this.width == ((Paddle)obj).width &&
				this.speed == ((Paddle)obj).speed &&
				this.color.equals(((Paddle)obj).getColor());
	}

   public void moveUpAndDraw(Graphics window)
   {
	   
	    draw(window,Color.white);

	    super.setY(getY()+getSpeed());
	
	    draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	    draw(window,Color.white);

	    super.setY(getY()-getSpeed());
	    
	    draw(window);
   }

   //add get methods
   
   public int getSpeed() {
	return speed;
   }
   
   public String toString()
   {
	   return "xPos: " + xPos + "\nyPos: " + yPos + "\nwidth: " + width + "\nheight: " + height + "\nspeed: " + speed + "\n";  
   }



   
   
   
   //add a toString() method
}
