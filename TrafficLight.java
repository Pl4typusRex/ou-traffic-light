import ou.*;
/**
 * TrafficLight for TMA03Q1.
 *
 * @author Pl4typusRex
 * @version (1.0)
 */
public class TrafficLight
{
   private Circle light;

   /**
    * Constructor for objects of class TrafficLight
    */
   public TrafficLight(Circle aCircle)
   {
      light = aCircle;
      light.setColour(OUColour.RED);
      light.setDiameter(50);
   }

   /**
    * setColour just sets the colour of the light as told to
    * 0 = red, 1 = green, 2 = orange
    */
   public void setColour(OUColour colour)
   {
      light.setColour(colour);
   }

   /**
    * setter for x position
    */
   public void setXPos(int xPos)
   {
      light.setXPos(xPos);
   }

   /**
    * setter for y position
    */
   public void setYPos(int yPos)
   {
      light.setYPos(yPos);
   }

}
