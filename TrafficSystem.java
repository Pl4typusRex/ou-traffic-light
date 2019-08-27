import ou.*;
/**
 * TrafficSystem for TMA03Q1.
 *
 * @author Pl4typusRex
 * @version (1.0)
 */
public class TrafficSystem
{
   // given instance variables for the four lights
   private TrafficLight north;
   private TrafficLight south;
   private TrafficLight east;
   private TrafficLight west;

   private int state;

   // indicates if the system is working automatically (true)
   private boolean go;


   /**
    * Constructor for TrafficSystem class
    */
   public TrafficSystem(TrafficLight n, TrafficLight s, TrafficLight e, TrafficLight w)
   {
      north = n;
      south = s;
      east = e;
      west = w;

      setPositions();

      state = 0;
      colourAllLights();

      go = false;
   }

   /**
    * updates the value of state, colours the lights then delays
    */
   public void runLights()
   {
      while(go)
      {
         cycleState();
         colourAllLights();
         delay(2000);
      }
   }

   /**
    * sets the value of go
    */
   public void setGo(boolean value)
   {
      go = value;
   }

   /**
    * cycle through traffic light state
    */
   private void cycleState()
   {
      if(state >= 0 && state < 4)
      {
         state++;
      }
      else if(state == 4)
      {
         state = 1;
      }
   }

   /**
    * set colour of traffic light based on state
    */
   private void colourAllLights()
   {
      if(state == 1)
      {
         colourLight(north, OUColour.GREEN);
         colourLight(south, OUColour.GREEN);
         colourLight(east, OUColour.RED);
         colourLight(west, OUColour.RED);
      }
      else if(state == 2)
      {
         colourLight(north, OUColour.ORANGE);
         colourLight(south, OUColour.ORANGE);
         colourLight(east, OUColour.RED);
         colourLight(west, OUColour.RED);
      }
      else if(state == 3)
      {
         colourLight(north, OUColour.RED);
         colourLight(south, OUColour.RED);
         colourLight(east, OUColour.GREEN);
         colourLight(west, OUColour.GREEN);
      }
      else if(state == 4)
      {
         colourLight(north, OUColour.RED);
         colourLight(south, OUColour.RED);
         colourLight(east, OUColour.ORANGE);
         colourLight(west, OUColour.ORANGE);
      }
      else if(state == 0)
      {
         colourLight(north, OUColour.RED);
         colourLight(south, OUColour.RED);
         colourLight(east, OUColour.RED);
         colourLight(west, OUColour.RED);
      }
   }

   private void setPositions() // provided method
   {
      north.setXPos(100);
      north.setYPos(0);
      south.setXPos(100);
      south.setYPos(200);
      west.setXPos(0);
      west.setYPos(100);
      east.setXPos(200);
      east.setYPos(100);
   }

   /**
    * Sets colour of given TrafficLight object to the given colour
    */
   public void colourLight(TrafficLight aLight, OUColour aColour)
   {
      aLight.setColour(aColour);
   }

   /**
    * Provided method without try catch or the checking for 0-4 state.
    * Extra functionality is to be added to deal with non-integer
    * or out of range inputs
    */
   public void manualOverride()
   {
      if (!go)
      {
         try
         {
            int newState = Integer.parseInt(OUDialog.request("Please give the state you want to change to - between 0 and 4 inclusive"));
            if(newState > 0 && newState <=4)
            {
               state = newState;
               colourAllLights();
            }
            else
            {
               System.out.println("Error: State unchanged, entered string is outside required range");
            }
         }
         catch(NumberFormatException e)
         {
            System.out.println("Error: State unchanged, entered string cannot be converted to an integer");
         }
      }
   }

   /**
    * causes execution to pause by time number of milliseconds
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time);
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
   }

}
