
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	
	
	
	public Ball(int x, int y)
	{
		xSpeed = x;
		ySpeed = y;
	}

	public void setXSpeed(int x) {
		// TODO Auto-generated method stub
		xSpeed = x;

	}

	public void setYSpeed(int y) {
		// TODO Auto-generated method stub
		ySpeed = y;

	}
	
	
	public int getXSpeed() {
		// TODO Auto-generated method stub
		return xSpeed;
	}

	public int getYSpeed() {
		// TODO Auto-generated method stub
		return ySpeed;
	}   
	

	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window,Color.white);


      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window, super.getColor());
   }
   
	public boolean equals(Object obj)
	{
		Ball ball = (Ball) obj;

		  if( ball.getXSpeed() != xSpeed)
				return false;
			
		  else if(ball.getYSpeed() != ySpeed)
			  return false;
	
			  return true;


	}


   //add the get methods

   //add a toString() method
	public String toString()
	{
		  return super.toString() + " " + xSpeed + " " + ySpeed;
	}
	
}
