/**
 * Name: Eric J. Hachuel
 * CSCI 455 PA1
 * Fall 2016
 */

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */

//Import statements

import java.util.Random;


public class CoinTossSimulator {

   //Constant(s) declaration
    
   /* Constant RANDOM_GENERATOR_OUTCOMES simulates the (4) potential outcomes 
    (HH, TT, HT, TH) of the two tosses of a single trial. */
    
   private final int RANDOM_GENERATOR_OUTCOMES = 4;
    
   //Instance Variable declaration
    
   private int totalTrials; //total amount of trials
   private int twoHeadsTrials; //total amount of trials resulting in two consecutive heads
   private int twoTailsTrials; //total amount of trials resulting in two consecutive tails
   private int headTailTrials; //total amount of trials resulting in one head/one tail pairs
   private static final int TWO_TAILS = 3; // Represents two tails outcome from the random number generator
   private static final int TWO_HEADS = 0; //Represents two head outcome from the random number generator
   
   /**
      Creates a coin toss simulator with no trials done yet (constructor).
   */
   
   public CoinTossSimulator()
   {
       totalTrials = 0;
       twoHeadsTrials = 0;
       twoTailsTrials = 0;
       headTailTrials = 0;
   }

   /**
     Runs the simulation for numTrials more trials. Multiple calls to this
     without a reset() between them add these trials to the simulation
     already completed.
      
     @param numTrials  number of trials to for simulation; must be >= 0
   */
   
   public void run(int numTrials) 
   {
       totalTrials = totalTrials + numTrials;
       Random randNumber = new Random(); //put as instance variable so that you don't generate one everytime you run
        
        for (int i=0; i < numTrials; i++ )
        {
            int randNumberResult = randNumber.nextInt(RANDOM_GENERATOR_OUTCOMES);
            
            if (randNumberResult == TWO_TAILS) 
            {
                twoTailsTrials++;
            }
            else if (randNumberResult == TWO_HEADS)
            {
                twoHeadsTrials++;
            }
            else
            {
                headTailTrials++;
            }
        }
   }
    
   /**
     Get number of trials performed since last reset.
     @return total amount of trials since last reset.
   */
   
   public int getNumTrials() 
   {
       return totalTrials;
   }

   /**
     Get number of trials that came up two heads since last reset.
     @return two heads trials since last reset.
   */
   
   public int getTwoHeads() 
   {
       return twoHeadsTrials;
   }

   /**
     Get number of trials that came up two tails since last reset.
     @return two tails trials since last reset.
   */  
   
   public int getTwoTails() 
   {
       return twoTailsTrials;
   }

   /**
     Get number of trials that came up one head and one tail since last reset.
     @return head tail trials since last reset.
   */
   
   public int getHeadTails() 
   {
       return headTailTrials; 
   }

   /**
     Resets the simulation, so that subsequent runs start from 0 trials done.
   */
   public void reset() 
   {
       totalTrials = 0;
       twoHeadsTrials = 0;
       twoTailsTrials = 0;
       headTailTrials = 0;
   }

}
