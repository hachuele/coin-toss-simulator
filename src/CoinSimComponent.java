/**
 * Name: Eric J. Hachuel
 * CSCI 455 PA1
 * Fall 2016
 */


// Import Statements

import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Color;

/**
 * CoinSimComponent class
 * 
 * Extends JComponent. Constructor initializes data and runs the simulation. 
 * Overrides paintComponent to draw the bar graph, using Bar objects
 * for each bar in the graph.
 * 
 */

public class CoinSimComponent extends JComponent {
    
   //Constant declaration
    
   private static final double WINDOW_BUFFER = 0.05; //5% component buffer for rectangle height.
    
   //Instance variable declaration
    
   private int totalTrials; //total amount of trials 
   private int twoHeadsTrials; //total amount of trials resulting in two consecutive heads
   private int twoTailsTrials; //total amount of trials resulting in two consecutive tails
   private int headTailTrials; //total amount of trials resulting in one head/one tail pairs
   private int twoHeadsTrialsPercent; //percent of trials resulting in two consecutive heads
   private int twoTailsTrialsPercent; //percent of trials resulting in two consecutive tails
   private int headTailTrialsPercent; //percent of trials resulting in one head/one tail pairs
   
   /** 
   * CoinSimComponent class 
   * 
   * Constructs a coin toss simulator viewer. Runs simulation with user input.
   * @param numTrials total number of trials since last reset.
   * 
   */
   
   public CoinSimComponent(int numTrials)
    {
        CoinTossSimulator simulatorViewer = new CoinTossSimulator();
        
        simulatorViewer.run(numTrials);
        totalTrials = simulatorViewer.getNumTrials();
        twoHeadsTrials = simulatorViewer.getTwoHeads();
        twoTailsTrials = simulatorViewer.getTwoTails();
        headTailTrials = simulatorViewer.getHeadTails();
        twoHeadsTrialsPercent = (int) ((twoHeadsTrials * 100.0) / totalTrials);
        twoTailsTrialsPercent = (int) ((twoTailsTrials * 100.0) / totalTrials);
        headTailTrialsPercent = (int) ((headTailTrials * 100.0) / totalTrials);
    }
    
    /**
    * This component draws the bar graph, using Bar objects.
    * @param g graphics parameter.
    */
   
   @Override
    public void paintComponent (Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //local variables 
        
        int componentHeight = getHeight();
        int componentWidth =  getWidth();
        int labelBottom = componentHeight - (int) Math.round(componentHeight * WINDOW_BUFFER); // Adds 5% window buffer to bottom location
        int barWidth = (int) Math.round(getWidth() * 0.1); // Bar width as 10% of component width 
        int twoHeadsLeft = (componentWidth / 4) - (barWidth / 2); //Divides width in (4) equal parts and removes half the bar width 
        int headTailLeft = (componentWidth / 2) - (barWidth / 2); //Divides width in (2) equal parts and removes half the bar width
        int twoTailsLeft = (componentWidth * 3) / 4 - (barWidth / 2); //Divides width in (3/4) equal parts and removes half the bar width
        
        /**
         * Calculates units per pixel and removes total buffer (10%) to calculate rectangle height.
         */
        
        double unitsPerPixel = (double) totalTrials / (componentHeight - (int) Math.round(componentHeight * 2 * WINDOW_BUFFER));
                
        Bar twoHeadsBar = new Bar (labelBottom,twoHeadsLeft,barWidth,twoHeadsTrials,unitsPerPixel,Color.RED, "Two Heads: " 
                + twoHeadsTrials + " (" + twoHeadsTrialsPercent + "%)");
        Bar headTailBar = new Bar (labelBottom,headTailLeft,barWidth,headTailTrials,unitsPerPixel,Color.GREEN, "A head and a Tail: " 
                + headTailTrials + " (" + headTailTrialsPercent + "%)");
        Bar twoTailsBar = new Bar (labelBottom,twoTailsLeft,barWidth,twoTailsTrials,unitsPerPixel,Color.BLUE, "Two Tails: " 
                + twoTailsTrials + " (" + twoTailsTrialsPercent + "%)");
        
        twoHeadsBar.draw(g2);
        headTailBar.draw(g2);
        twoTailsBar.draw(g2);
    }  
}
