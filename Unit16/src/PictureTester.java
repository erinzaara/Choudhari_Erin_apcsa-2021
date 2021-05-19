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
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue(){
	    Picture swan = new Picture("swan.jpg");
	    swan.keepOnlyBlue();
	    swan.explore();
	  }
  public static void testNegate(){
	    Picture swan = new Picture("swan.jpg");
	    swan.negate();
	    swan.explore();
	  }
  public static void testGrayscale(){
	    Picture swan = new Picture("swan.jpg");
	    swan.grayscale();
	    swan.explore();
  }
  
public static void testMirrorVertical2(){
	        Picture swan = new Picture("swan.jpg");
	        swan.mirrorVerticalRightToLeft();
	        swan.explore();
	      }
public static void testMirrorHorizontal2(){
	        Picture swan = new Picture("swan.jpg");
	        swan.mirrorHorizontalBotToTop();
	        swan.explore();
	      }
public static void testMirrorArms(){
    Picture snowman = new Picture("snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void testMirrorGull(){
    Picture gull = new Picture("seagull.jpg");
    gull.mirrorGull();
    gull.explore();
  }
  
  public static void testCollage2()
  {
  	Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }

  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
    Picture swan2 = new Picture("swan.jpg");
    swan2.edgeDetection2(10);
    swan2.explore();
  }

  public static void testAddHat()
  {
  	Picture swan = new Picture("swan.jpg");
  	swan.addHat();
  	swan.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}