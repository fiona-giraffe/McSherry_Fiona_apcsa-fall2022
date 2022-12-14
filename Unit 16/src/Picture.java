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
  
  public void Extension(Picture overPict, int x, int y, int w, int h) {
	  Pixel[][] messagePixels = overPict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	 
	  for (int row = y; row < h; row++)
	    {
	      for (int col = x; col < w; col++)
	      {
	    	  currPixel = currPixels[row][col];
	    	  messagePixel = messagePixels[row][col];
	    	  
	    	  currPixel.setBlue((currPixel.getBlue() + messagePixel.getBlue())/2);
	    	  currPixel.setRed((currPixel.getRed() + messagePixel.getRed())/2);	  
	    	  currPixel.setGreen((currPixel.getGreen() + messagePixel.getGreen())/2);
	      }
	    }
  }
  
  public void DropShadow(int x, int y, int w, int h) {
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  
	  for(int row = x; row < h; row++) {
		  for(int col = y; col < w; col++) {
			  currPixel = currPixels[row][col];
			  
			  if(row + 5 < this.getHeight() && col + 5 < this.getWidth() && currPixel.colorDistance(Color.BLACK) < 50) {
				  if((currPixels[row + 5][col + 5]).colorDistance(Color.BLACK) > 50) {
					  currPixel = currPixels[row + 5][col + 5];
					  currPixel.setRed(151);
					  currPixel.setBlue(151);
					  currPixel.setGreen(151);
				  } 
			  }
		  }
	  }
  }
  
  public void Warp() {
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null; 
	  int w = this.getWidth();
	  int h = this.getHeight();
	  
	  for(int i = 0; i < h; i++) {
		  for(int j = 0; j < w; j++) {
			  currPixel = currPixels[i][j];
			  
			  int r = currPixel.getRed();
			  int g = currPixel.getGreen();
			  int b = currPixel.getBlue();
			  
			  int x = (int) Math.abs((i * Math.cos(j * (Math.PI/100))));
			  int y = j;
			  
			  currPixel = currPixels[x][y];
			  currPixel.setRed(r);
			  currPixel.setGreen(g);
			  currPixel.setBlue(b);
		  }
	  }
  }
  
  private int sin(double d) {
	// TODO Auto-generated method stub
	return 0;
}

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
  
  /** Method to set all colors except blue to 0 */
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  /** Method to negate all pixels: 255 minus original number */
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setBlue(255 - pixelObj.getBlue());
		  }
	  }
  }
  
  /** Method to set to grayscale: add rgb and divide by 3, set all 3 to this value */
  public void grayscale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels) {
		  for(Pixel pixelObj : rowArray) {
			  int gray = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
			  pixelObj.setRed(gray);
			  pixelObj.setGreen(gray);
			  pixelObj.setBlue(gray);
		  }
	  }
  }
  
  /** method to make fix more visible */
  public void fixUnderwater() {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels) {
	    	for (Pixel pixelObj : rowArray){
	    		int r = Math.abs(pixelObj.getRed() - 20);
	    		int g = Math.abs(pixelObj.getGreen() - 160);
	    		int b = Math.abs(pixelObj.getBlue() - 170);
	        
	    		int diff = r + g + b;
	    		if (diff > 20) {
	    			pixelObj.setRed(255);
	    			pixelObj.setGreen(255);
	    			pixelObj.setBlue(255);
	    		}
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
  
  public void mirrorVerticalRightToLeft() {
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
  
  public void mirrorHorizontal() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  for (int row = 0; row < height/2; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
	      {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[height-1-row][col];
			  bottomPixel.setColor(topPixel.getColor());
	      }
	  }
  }
  
  public void mirrorHorizontalBotToTop() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  for (int row = 0; row < height/2; row++)
	  {
		  for (int col = 0; col < pixels[0].length; col++)
	      {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[height-1-row][col];
			  topPixel.setColor(bottomPixel.getColor());
	      }
	  }
  }
  
  public void mirrorDiagonal() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topRightPixel = null;
      Pixel bottomLeftPixel = null;
      int maxLen;
      if (pixels.length < pixels[0].length) { 
    	  maxLen = pixels.length; 
      }
      else {
    	  maxLen = pixels[0].length; 
      }
      for (int row = 0; row < maxLen; row++)
      {
          for (int col = row; col < maxLen; col++)
          {
              topRightPixel = pixels[row][col];
              bottomLeftPixel = pixels[col][row];
              topRightPixel.setColor(bottomLeftPixel.getColor());
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
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  public void mirrorArms() {
	    int mirrorPoint = 193;
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    for (int row = 158; row < mirrorPoint; row++)
	    {
	      for (int col = 103; col < 170; col++)
	      {
	        topPixel = pixels[row][col];      
	        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
	        bottomPixel.setColor(topPixel.getColor());
	      }
	    }
	    
	    int mirrorPoint2 = 198;
	    Pixel topPixel2 = null;
	    Pixel bottomPixel2 = null;
	   
	    for (int row = 171; row < mirrorPoint2; row++)
	    {
	      for (int col = 239; col < 294; col++)
	      {
	        topPixel2 = pixels[row][col];      
	        bottomPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
	        bottomPixel2.setColor(topPixel2.getColor());
	      }
	    }
  }
  
  public void mirrorGull() {
	  int mirrorPoint = 345;
	  Pixel rightPixel = null;
	  Pixel leftPixel = null;
	  Pixel[][] pixels = this.getPixels2D();   

	  for (int row = 234; row < 323; row++)
	  {
	     for (int col = 237; col < mirrorPoint; col++)
	     {
	    	 rightPixel = pixels[row][col];      
	    	 leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
	    	 leftPixel.setColor(rightPixel.getColor());
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
  
  public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol) {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++)
	    {
	      for (int fromCol = 0, toCol = startCol; 
	           fromCol < fromPixels[0].length &&
	           toCol < endCol;  
	           fromCol++, toCol++)
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
    Picture flower1 = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\flower1.jpg");
    Picture flower2 = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\flower2.jpg");
    this.copy2(flower1, 0, 100, 0, 100);
    //this.copy(flower1,0,0);
    this.copy2(flower2, 100, 200, 0, 100);
    //this.copy(flower2,100,0);
    this.copy2(flower1, 200, 300, 0, 100);
    //this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy2(flowerNoBlue, 300, 400, 0, 100);
    //this.copy(flowerNoBlue,300,0);
    this.copy2(flower1, 400, 480, 0, 100);
    //this.copy(flower1,400,0);
    //this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\collage.jpg");
  }
  
  public void myCollage() {
	  Picture butterfly = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\koala.jpg");
	  this.copy2(butterfly, 0, 100, 0, 100);
	  Picture butterflyGray = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\koala.jpg");
	  butterflyGray.grayscale();
	  this.copy2(butterflyGray, 0, 100, 100, 200);
	  this.copy2(butterfly, 0, 100, 200, 300);
	  Picture butterflyBlue = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\koala.jpg");
	  butterflyBlue.keepOnlyBlue();
	  this.copy2(butterflyBlue, 0, 100, 300, 400);
	  this.mirrorHorizontal();
	  this.write("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\collage.jpg");
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
  Picture copy = new Picture(this);
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  Pixel[][] pixels = this.getPixels2D();
  Color rightColor = null;

  for (int row = 0; row < pixels.length; row++) {
	  for (int col = 0; col < pixels[0].length-1; col++) {
		  leftPixel = pixels[row][col];
		  rightPixel = pixels[row][col+1];
		  rightColor = rightPixel.getColor();
		  if (leftPixel.colorDistance(rightColor) > edgeDist) {
			  leftPixel.setColor(Color.BLACK);
		  }
		  else {
			  leftPixel.setColor(Color.WHITE);
		  }
	  }
  }

  Pixel[][] copyPixels = copy.getPixels2D();
  Pixel topPixel = null;
  Pixel botPixel = null;
  Color botColor = null;
  for (int row = 0; row < copyPixels.length-1; row++) {
	  for (int col = 0; col < copyPixels[0].length; col++) {
		  topPixel = copyPixels[row][col];
		  botPixel = copyPixels[row+1][col];
		  botColor = botPixel.getColor();
		  if (topPixel.colorDistance(botColor) > edgeDist) {
			  pixels[row][col].setColor(Color.BLACK);
		  }
	   }
  	}
 }

  /** Hide a black and white message in the current
  * picture
  * @param messagePict the picture with a message
  */
  public void encode(Picture messagePict) {
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++) {

			  currPixel = currPixels[row][col];
			  
			  //if pixel has multiple of 5 in rgb add 1
			  
			  if(currPixel.getRed() == 255)
				  currPixel.setRed(254);
			  else if(currPixel.getRed() % 5 == 0)
				  currPixel.setRed(currPixel.getRed() + 1);
			  
			  if(currPixel.getGreen() == 255)
				  currPixel.setGreen(254);
			  else if (currPixel.getGreen() % 5 == 0)
				  currPixel.setGreen(currPixel.getGreen() + 1);
			  
			  if(currPixel.getBlue() == 255)
				  currPixel.setBlue(254);
			  else if (currPixel.getBlue() % 5 == 0)
				  currPixel.setBlue(currPixel.getBlue() + 1);
			  
			  messagePixel = messagePixels[row][col];
			 
			  //move pixels into diagonal
			  
			  if(messagePixel.colorDistance(Color.BLACK) < 50) {
//				  if(row+col < this.getHeight()) {
//					  currPixels[row+col][col] = currPixel;
//				  }
//				  else {
//					  currPixels[row+col - this.getHeight()][col] = currPixel;
//				  }
				  count++;
			  }
			  
			  //change message pixel in cover image to closest multiple of 5
			  
			  //code to alternate between changing rgb
			  int[] choose = {1, 2, 3};
			  int a = choose[0];
			  if(row % 3 == 0) {
				  a = choose[0];
			  }
			  else if(row % 3 == 1) {
				  a = choose[1];
			  }
			  else if(row % 3 == 2) {
				  a = choose[2];
			  }
			  
			  if(a == 1) {
				  if (messagePixel.colorDistance(Color.BLACK) < 50) {
					  if(currPixel.getRed() % 5 > 2)
						  currPixel.setRed(currPixel.getRed() + (5 - currPixel.getRed()%5));
					  else
						  currPixel.setRed(currPixel.getRed() - currPixel.getRed()%5);
				  } 
			  }
			  else if(a == 2) {
				  if (messagePixel.colorDistance(Color.BLACK) < 50) {
					  if(currPixel.getGreen() % 5 > 2)
						  currPixel.setGreen(currPixel.getGreen() + (5 - currPixel.getGreen()%5));
					  else
						  currPixel.setGreen(currPixel.getGreen() - currPixel.getGreen()%5);
				  }
			  }
			  else if(a == 3) {
					 if (messagePixel.colorDistance(Color.BLACK) < 50) {
						 if(currPixel.getBlue() % 5 > 2)
							  currPixel.setBlue(currPixel.getBlue() + (5 - currPixel.getBlue()%5));
						  else
							  currPixel.setBlue(currPixel.getBlue() - currPixel.getBlue()%5);
					  }
			  }
			  
//			  if (currPixel.getRed() % 5 == 0 || currPixel.getGreen() % 5 == 0 || currPixel.getBlue() % 5 == 0)
//				  currPixel.setColor(Color.BLACK);  //for testing
		  }
	  }

  System.out.println(count);
  }
  
  /**
  * Method to decode a message hidden in the
  * red value of the current picture
  * @return the picture with the hidden message
  */
  public Picture decode() {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++) {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (currPixel.getRed() % 5 == 0 || currPixel.getGreen() % 5 == 0 || currPixel.getBlue() % 5 == 0)
			  {
//				  if(row-col >= 0)
//					  messagePixel = messagePixels[row-col][col];
				  messagePixel.setColor(Color.BLACK);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
