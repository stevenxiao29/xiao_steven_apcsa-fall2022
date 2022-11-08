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


	}

	//add other Block constructors - x , y , width, height, color
	
	
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}

	

	
	
   //add the other set methods
   

   public void setColor(Color col)
   {


   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      //window.setColor(color);
      //window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}

	@Override
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos = x;

	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos = y;

	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}

	public void setYSpeed(int y) {
		// TODO Auto-generated method stub
		
	}

	public void setXSpeed(int x) {
		// TODO Auto-generated method stub
		
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}