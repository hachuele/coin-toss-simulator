/**
 * Name: Eric J. Hachuel
 * CSCI 455 PA1
 * Fall 2016
 */

// Import Statements

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */

public class Bar {

   //Instance Variable declaration
    
   private int bottomLabelLocation;
   private int leftBarLocation;
   private int barWidth;
   private int barHeightUnits;
   private double appUnitsPixelHeight;
   private Color barColor;
   private String labelStr;
   
   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter unitsPerPixel). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar
      @param numUnits  height of the bar in application units
      @param unitsPerPixel  how many application units per pixel for height
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   
   public Bar(int bottom, int left, int width, int numUnits, 
              double unitsPerPixel, Color color, String label) 
   { 
   bottomLabelLocation = bottom;
   leftBarLocation = left;
   barWidth = width;
   barHeightUnits = numUnits;
   appUnitsPixelHeight = unitsPerPixel;
   barColor = color;
   labelStr = label;        
   }
   
   /**
      Draw the labeled bar. 
      @param g2  the graphics context
   */
   
   public void draw(Graphics2D g2) 
   {
       
       Font font = g2.getFont();
       FontRenderContext context = g2.getFontRenderContext();
       Rectangle2D labelBounds = font.getStringBounds (labelStr, context);
       int widthOfLabel = (int)(Math.round(labelBounds.getWidth()));
       int heightOfLabel = (int)(Math.round(labelBounds.getHeight()));
       
       int rectWidth = barWidth;
       int rectHeight = (int) (barHeightUnits / appUnitsPixelHeight);
       int x = leftBarLocation; 
       int y = bottomLabelLocation - rectHeight - heightOfLabel;

       Rectangle coinTossRect = new Rectangle (x, y, rectWidth, rectHeight);
       g2.setColor(barColor);
       g2.fill(coinTossRect);
       
       int xLabel = leftBarLocation + (barWidth / 2) - (widthOfLabel / 2);
       g2.setColor(Color.BLACK); 
       g2.drawString(labelStr, xLabel, bottomLabelLocation);
      
   }
}
