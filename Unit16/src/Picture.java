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
  
  public void zeroRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
      }
    }
  }
  
  public void zeroGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
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
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
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
				int ave = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())/ 3;
				pixelObj.setBlue(ave);
				pixelObj.setRed(ave);
				pixelObj.setGreen(ave);
			}
		}
	}


public void modcol()
{
	int g = 0;
	int r = 0;
	int b = 0;
	
Pixel[][] pixels = this.getPixels2D();

int tpixels = pixels.length * pixels[0].length;

for (Pixel[] rowArray : pixels)
{
  for (Pixel pixelObj : rowArray)
  {
	  g += pixelObj.getGreen();
	  b += pixelObj.getBlue();
	  r += pixelObj.getRed();
  }
}
int gav = g / tpixels;
int bav = b / tpixels;
int rav = r / tpixels;

for (Pixel[] rowArray : pixels)
	{
		for (Pixel pixelObj : rowArray)
		{
			pixelObj.setGreen(pixelObj.getGreen() + (200-gav));
			pixelObj.setBlue(pixelObj.getBlue()+ (200-bav));
			pixelObj.setRed(pixelObj.getRed() + (200-rav));
		}
	}
}


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
  
  public void mirrorVerticalRL()
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
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels.length;
    
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < width / 2; row++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[width - 1 - row][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBT() 
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels.length;
	    
	  for (int col = 0; col < pixels[0].length; col++)
	  {
	    for (int row = 0; row < width / 2; row++)
	    {
	      leftPixel = pixels[row][col];
	      rightPixel = pixels[width - 1 - row][col];
	      leftPixel.setColor(rightPixel.getColor());
	    }
	  } 
  }
  
  public void mirrorDiagonal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels.length;
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
	    for (int col = 0; col < row; col++)
	    {
	      leftPixel = pixels[row][col];
	      rightPixel = pixels[col][row];
	      leftPixel.setColor(rightPixel.getColor());
	    }
	  } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
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
      }
    }
  }
  
  public void mirrorArms()
  {
	  int mirrorPoint = 196;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
		    
	  for (int row = 162; row < mirrorPoint; row++)
	  {
		 for (int col = 111; col < 297; col++)
		 {
			leftPixel = pixels[row][col];      
			rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
			rightPixel.setColor(leftPixel.getColor());
		 }
	  }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 342;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int count = 0;
	  Pixel[][] pixels = this.getPixels2D();
		    
	  for (int row = 221; row < 335; row++)
	  {
		  for (int col = 233; col < mirrorPoint; col++)
		  {
			  count++;
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
  
  public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < endCol; fromCol++, toCol++)
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
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  public void myCollage()
  {
 	 Picture flower = new Picture("src/images/flower1.jpg");
 	 this.copy(flower,0,35);
 	 this.copy(flower,0,35);
 	 this.copy(flower,100,35);
 	 this.zeroBlue();
 	 this.zeroRed();
 	 this.copy(flower,0,35);
 	 this.mirrorVertical();
 	 this.negate();
 	 this.write("src/images/collage.jpg");
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
  
  public void edgeDetection2(int edgeDist)
  {
  	Pixel leftPixel = null;
  	Pixel nextPixel = null;
  	Pixel[][] pixels = this.getPixels2D();
  	Color nextColor = null;
  	for (int row = 0; row < pixels.length; row++)
  	{
  		for (int col = 0; col < pixels[0].length; col++)
  		{
  			if (col < pixels[0].length - 1) {
  				leftPixel = pixels[row][col];
  				nextPixel = pixels[row][col + 1];
  				nextColor = nextPixel.getColor();
  				if (leftPixel.colorDistance(nextColor) > edgeDist) {
  					leftPixel.setColor(Color.BLACK);
  					continue;
  				}
  			}
  			if (row < pixels.length - 1) {
  				nextPixel = pixels[row+1][col];
  				nextColor = nextPixel.getColor();
  				if (leftPixel.colorDistance(nextColor) > edgeDist) {
  					leftPixel.setColor(Color.BLACK);
  					continue;
  				}
  			}
  			leftPixel.setColor(Color.WHITE);
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

  
  public void chromakey(Picture newBack)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] fromPixels = newBack.getPixels2D();
	  Pixel[][] toPixels = this.getPixels2D();
	  
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  toPixel = toPixels[row][col];
			  
			  if (toPixel.getBlue() > toPixel.getRed() && toPixel.getBlue() > toPixel.getGreen())
			  {
				  fromPixel = fromPixels[row][col];
				  toPixel.setColor(fromPixel.getColor());
			  }
		  }
	  }
  }
  
  public void getCountRedOverValue(int val)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel pixelObj = null;
	  int cnt = 0;
	  
	  for (int r = 0; r < this.getHeight(); r++)
	  {
		  for (int c = 0; c < this.getWidth(); c++)
		  {
			  pixelObj = pixels[r][c];
			  if (pixelObj.getRed() > val)
				  cnt++;
		  }
	  }
	  
	  System.out.println("There are " + cnt + " pixels over the red value of " + val);
  }
  
  public void setRedToHalfValueInTopHalf()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel pixelObj = null;
	  
	  for (int r = 0; r < this.getHeight() / 2; r++)
	  {
		  for (int c = 0; c < this.getWidth(); c++)
		  {
			  pixelObj = pixels[r][c];
			  pixelObj.setRed(pixelObj.getRed()/2);
		  }
	  }
  }
  
  public void clearBlueOverValue(int val)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel pixelObj = null;
	  
	  for (int r = 0; r < this.getHeight() / 2; r++)
	  {
		  for (int c = 0; c < this.getWidth(); c++)
		  {
			  pixelObj = pixels[r][c];
			  if (pixelObj.getBlue() > val)
				  pixelObj.setBlue(0);
		  }
	  }
  }


public void addHat()
{
addBox(150,342,10,120);
addBox(90,401,120,190);
addBox(167,218,299,332);
addBox(254,307,299,332);
addBox(218,254,315,320);
}

public void addBox(int x1, int x2, int y1, int y2){
Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel botPixel = null;
	int height = pixels.length;
	for (int row = y1; row < y2 ; row++)
	{
		for (int col = x1; col < x2; col++)
		{
			topPixel = pixels[row][col];
			//botPixel = pixels[height - row - 1][col];
			topPixel.setColor(Color.BLACK);
		}
	}
}


  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
	Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
