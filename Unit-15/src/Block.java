
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
		setX(x);
		setY(y);
		color = Color.black;
	}
	
	
	public Block(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		color = Color.black;
	}
	
	public Block(int x, int y, int w, int h, Color col) {
		setPos(x,y);
		setWidth(w);
		setHeight(h);
		setColor(col);
	}
	

	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	color = col;

   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	 window.setColor(col);
	 window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{

		return this.height == ((Block)obj).height && 
				this.xPos == ((Block)obj).xPos && 
				this.yPos == ((Block)obj).yPos &&
				this.width == ((Block)obj).width &&
				this.color == ((Block)obj).getColor();
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
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}

	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Color getColor()
	{
		return color;
	}

	
	public void setWidth(int wid)
	{
		width = wid;
	}
	
	public void setHeight(int hei)
	{
		height = hei;
	}

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}
