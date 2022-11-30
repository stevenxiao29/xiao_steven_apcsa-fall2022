	import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }
  
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(pixelObj.getBlue()-255);
        pixelObj.setRed(pixelObj.getRed()-255);
        pixelObj.setGreen(pixelObj.getGreen()-255);
      }
    }
  }
  
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int avgVal = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())/3;
    	
        pixelObj.setBlue(avgVal);
        pixelObj.setRed(avgVal);
        pixelObj.setGreen(avgVal);
      }
    }
  }
  
  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
	Pixel pixel = null;
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {    	
    	pixelObj.setRed(pixelObj.getRed() * 3);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels[0].length;
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = 0; col < width / 2; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][width - 1 - col];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  public void mirrorVerticalRightToLeft()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels[0].length;
	  for (int row = 0; row < pixels.length; row++)
	  {
		  for (int col = width / 2; col < width; col++)
		  {
			  // og: start from c 0 
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][width - 1 - col];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  public void mirrorHorizontal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  int height = pixels.length;
	  for (int row = 0; row < height / 2; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  topPixel = pixels[row][col];
			  botPixel = pixels[height - row - 1][col];
			  botPixel.setColor(topPixel.getColor()); 
		  }
	  } 
  }
  public void mirrorHorizontalBotToTop()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  int height = pixels.length;
	  for (int row = 0; row < height / 2; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
		  {
			  topPixel = pixels[row][col];
			  botPixel = pixels[height - row - 1][col];
			  topPixel.setColor(botPixel.getColor()); 
		  }
	  } 
  }
  public void mirrorDiagonal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int max = pixels.length;
	  if (pixels[0].length < max)
	  max = pixels[0].length;
	  for (int row = 1; row < max; row++)
	  {
		  for (int col = 0; col < row; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[col][row];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
	int count = 0;
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }
  
  public void mirrorArms()
  {
	int count = 0;
    int mirrorPoint = 171;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 154; row < 195; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 100; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row+75]                       
                         [mirrorPoint - col + mirrorPoint + 72];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    
    int mirrorPoint2 = 239;
    Pixel leftPixel2 = null;
    Pixel rightPixel2 = null;
    Pixel[][] pixels2 = this.getPixels2D();
    
    // loop through the rows
    for (int row = 154; row < 195; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 295; col > mirrorPoint2; col--)
      {
        //starts from leftmost side and mirrors on the right from right to left
    	// start from rigthmost side and mirrors from left to right
    	  leftPixel2 = pixels2[row][col];      
    	  rightPixel2 = pixels2[row+75]                       
                         [mirrorPoint2 - col + mirrorPoint2 - 76 ];
    	  rightPixel2.setColor(leftPixel2.getColor());
        count++;
      }
    }
    // System.out.println(count);
  }
  
  public void mirrorGull()
  {
    int mirrorPoint = 350;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 225; row < 330; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 220; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  public void copy(Picture fromPic,
		 int fromStartRow,
		 int fromStartCol,
		 int fromEndRow,
		 int fromEndCol,
		 int toStartRow,
		 int toStartCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = fromStartRow, toRow = toStartRow;fromRow <= fromEndRow && toRow < toPixels.length;fromRow++, toRow++)
		  {
		  for (int fromCol = fromStartCol, toCol = toStartCol;fromCol <= fromEndCol && toCol < toPixels[0].length;fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }
  }
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\\\Users\\\\xiaos3073\\\\Desktop\\\\AP CSA Fall 2022\\\\xiao_steven_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower1.jpg");
    Picture flower2 = new Picture("C:\\\\Users\\\\xiaos3073\\\\Desktop\\\\AP CSA Fall 2022\\\\xiao_steven_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\Users\\xiaos3073\\Desktop\\temp\\collage.jpg");
  }
  
  public void myCollage()
  {
    Picture beach = new Picture("C:\\\\Users\\\\xiaos3073\\\\Desktop\\\\AP CSA Fall 2022\\\\xiao_steven_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\beach.jpg");
    Picture seagull = new Picture("C:\\\\Users\\\\xiaos3073\\\\Desktop\\\\AP CSA Fall 2022\\\\xiao_steven_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\seagull.jpg");
    Picture flower1 = new Picture("C:\\\\Users\\\\xiaos3073\\\\Desktop\\\\AP CSA Fall 2022\\\\xiao_steven_apcsa-fall2022\\\\Unit-16\\\\src\\\\images\\\\flower1.jpg");
    this.copy(seagull,0,0);
    this.copy(flower1,100,0);
    this.copy(beach,200,0);
    Picture flowerNoBlue = new Picture(seagull);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    Picture seagullNegate = new Picture(seagull);
    seagullNegate.negate();
    this.copy(seagullNegate,500,0);
    Picture beachGrey = new Picture(beach);
    beachGrey.negate();
    this.copy(beachGrey,500,0);
    this.mirrorHorizontalBotToTop();
    this.write("C:\\Users\\xiaos3073\\Desktop\\temp\\collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("C:\\Users\\xiaos3073\\Desktop\\AP CSA Fall 2022\\xiao_steven_apcsa-fall2022\\Unit-16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
