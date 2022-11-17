/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** test keepOnlyBlue() */
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** test negate() */
  public static void testNegate() {
	  Picture beach = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  /** test grayscale() */
  public static void testGrayscale() {
	  Picture beach = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** test fixUnderwater() */
  public static void testFixUnderwater() {
	  Picture water = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
	  Picture caterpillar = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorVerticalRightToLeft();
	  caterpillar.explore();
  }
  
  public static void testMirrorHorizontal() {
	  Picture motor = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorHorizontal();
	  motor.explore();
  }
  
  public static void testMirrorHorizontalBotToTop() {
	  Picture motor = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorHorizontalBotToTop();
	  motor.explore();
  }
  
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snow = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\snowman.jpg");
    snow.explore();
    snow.mirrorArms();
    snow.explore();
  }
  
  public static void testMirrorGull() {
	Picture gull = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\seagull.jpg");
	gull.explore();
	gull.mirrorGull();
	gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testCopy() {
	Picture pic = new Picture("C:\\Users\\seang\\Documents\\apcsa-2022\\McSherry_Fiona_apcsa-fall2022\\Unit 16\\src\\images\\640x480.jpg");
	pic.createCollage();
	pic.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();                    //works
    //testKeepOnlyBlue();                //works
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();                      //works  
    //testGrayscale();                   //works
    //testFixUnderwater();               //works
    //testMirrorVertical();              //works
	//testMirrorVerticalRightToLeft();   //works
	//testMirrorHorizontal();            //works
	//testMirrorHorizontalBotToTop();    //works
    //testMirrorTemple();                //works
    //testMirrorArms();                  //works
    //testMirrorGull();                  //works
    //testMirrorDiagonal();              //works
    //testCollage();                     //works
	//testMyCollage();                   //works
    //testCopy();                        //copy1 works, copy2 works
    //testEdgeDetection();               //works
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}