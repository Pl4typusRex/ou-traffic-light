import ou.*;
/**
 * The class Square defines a shape with the characteristics of a square.
 *
 * @author Pl4typusRex
 * @version 2.0
 */

public class Square extends OUAnimatedObject
{
   /* Instance variables */

   private OUColour colour;
   private int xPos;
   private int yPos;
   private int length;

   /**
    * Zero argument constructor for objects of class Square
    * that sets colour to OUColour.ORANGE,
    * xPos and yPos to 0 and length to 15, .
    */
   public Square()
   {
      super();
      this.colour = OUColour.ORANGE;
      this.xPos = 0;
      this.yPos = 0;
      this.length = 15;
   }

   /**
    * Constructor for objects of class Square with arguments for
    * length and colour, and which sets xPos and yPos to 0.
    */
   public Square(int aLength, OUColour aColour)
   {
      super();
      this.length = aLength;
      this.colour = aColour;
      this.xPos = 0;
      this.yPos = 0;
   }
   /* Instance methods */

   /**
    * Sets the length of the receiver to the value of the argument aLength.
    */
   public void setLength(int aLength)
   {
      this.length = aLength;
      this.update();
   }

   /**
    * Returns the length of the receiver.
    */
   public int getLength()
   {
      return this.length;
   }

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
    * Returns a string representation of the receiver.
    */
   public String toString()
   {
      return "An instance of class " + this.getClass().getName()
      + ": position (" + this.getXPos() + ", " + this.getYPos()
      + "), length " + this.getLength() + ", colour " + this.getColour();
   }

}
