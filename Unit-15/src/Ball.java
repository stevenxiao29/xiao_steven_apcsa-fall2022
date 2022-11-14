//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;



public class Ball extends Block implements Collidable
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

	@Override
	public void setXSpeed(int x) {
		// TODO Auto-generated method stub
		xSpeed = x;

	}

	@Override
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


      setX(getX()+xSpeed);
		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{




		return false;
	}

	@Override
	public boolean didCollideLeft(Object obj) {

		
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}


   //add the get methods

   //add a toString() method
}