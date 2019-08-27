import ou.*;
/**
 * The class Diamond defines a shape with the characteristics of a diamond.
 *
 * @author Pl4typusRex
 * @version 2.0
 */
public class Diamond extends OUAnimatedObject
{
   /* instance variables */
   private OUColour colour;
   private int xPos;
   private int yPos;
   private int width;
   private int height;

   /**
    * Zero argument constructor for objects of class Diamond
    * that sets colour to OUColour.GREEN,
    * xPos and yPos to 0,.width to 50 and height to 100,
    */
   public Diamond()
   {
      super();
      this.colour = OUColour.GREEN;
      this.xPos = 0;
      this.yPos = 0;
      this.width = 50;
      this.height = 100;
   }

   /**
    * Constructor for objects of class Diamond with arguments for
    * width, height and colour, and which sets xPos and yPos to 0.
    */
   public Diamond(int aWidth, int aHeight, OUColour aColour)
   {
      super();
      this.width = aWidth;
      this.height = aHeight;
      this.colour = aColour;
      this.xPos = 0;
      this.yPos = 0;
   }

   /* instance methods */

   /**
    * Sets the colour of the receiver to the value of the argument aColour.
    */
   public void setColour (OUColour aColour)
   {
      this.colour = aColour;
      this.update();
   }

   /**
    * Returns the colour of the receiver.
    */
   public OUColour getColour ()
   {
      return this.colour;
   }

   /**
    * Sets the horizontal position of the receiver to the value of the argument x.
    */
   public void setXPos(int x)
   {
      this.xPos = x;
      this.update();
   }

   /**
    * Returns the horizontal position of the receiver.
    */
   public int getXPos()
   {
      return this.xPos;
   }

   /**
    * Sets the vertical position of the receiver to the value of the argument y.
    */
   public void setYPos(int y)
   {
      this.yPos = y;
      this.update();
   }

   /**
    * Returns the vertical position of the receiver.
    */
   public int getYPos()
   {
      return this.yPos;
   }

   /**
    * Sets the width of the receiver to the value of the argument aWidth.
    */
   public void setWidth(int aWidth)
   {
      this.width = aWidth;
      this.update();
   }

   /**
    * Returns the width of the receiver.
    */
   public int getWidth()
   {
      return this.width;
   }

   /**
    * Sets the height of the receiver to the value of the argument aHeight.
    */
   public void setHeight(int aHeight)
   {
      this.height = aHeight;
      this.update();
   }

   /**
    * Returns the height of the receiver.
    */
   public int getHeight()
   {
      return this.height;
   }

   /**
    * Returns a string representation of the receiver.
    */
   public String toString()
   {
      return "An instance of class " + this.getClass().getName()
      + ": position (" + this.getXPos() + ", " + this.getYPos()
      + "), width " + this.getWidth() + ", height " + this.getHeight()
      + ", colour " + this.getColour();
   }
}
