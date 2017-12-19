/**
 * Name: Eric J. Hachuel
 * CSCI 455 PA1
 * Fall 2016
 */


/**
 * CoinSimViewer class
 * 
 * Prompts for the number of trials and creates the JFrame containing the CoinSimComponent.
 * 
 */

// Import Statements

import java.util.Scanner;
import javax.swing.JFrame;

public class CoinSimViewer {
    
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner (System.in);
        int numTrialsInput = 0; 
        boolean validated = false;
        
        //while loop for positive value error-checking
        
        while (!validated)
        {
          System.out.print("Enter number of trials: ");
          numTrialsInput = in.nextInt();
          
          if (numTrialsInput > 0)
          {
              validated = true;
          }
          else
          {
              System.out.println("ERROR: Number entered must be greater than 0.");   
          }
        }
        
        //Creates the JFrame 
        
        JFrame coinSimFrame = new JFrame();
        coinSimFrame.setSize(800,500);
        coinSimFrame.setTitle("CoinSim");
        coinSimFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add Component to Frame
        
        CoinSimComponent component = new CoinSimComponent(numTrialsInput);
        coinSimFrame.add(component);
        coinSimFrame.setVisible(true);
    }
}
