/**
 * Name: Eric J. Hachuel
 * CSCI 455 PA1
 * Fall 2016
 */

/**
 * CoinTossSimulatorTester class
 * 
 * Tests the coin toss simulation for trials of tossing two coins. 
 * 
 */

public class CoinTossSimulatorTester {
    
    /** Determines whether the tosses add up correctly
     * @param twoHeadsAmount total amount of trials resulting in two consecutive heads
     * @param twoTailsAmount total amount of trials resulting in two consecutive tails
     * @param headTailsAmount total amount of trials resulting in one head/one tail pairs
     * @param totalTrialsAmount total amount of coin toss trials
     */
    
    private static void tossAdditionTester (int twoHeadsAmount, int twoTailsAmount, 
            int headTailsAmount, int totalTrialsAmount)
    {
        if (twoTailsAmount + twoHeadsAmount + headTailsAmount == totalTrialsAmount)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    
    public static void main(String[] args) 
    {
     
     CoinTossSimulator simulatorTester = new CoinTossSimulator();
     
     // Added 0 trials to the tester
     
     simulatorTester.run(0);
     System.out.println("After constructor:");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
 
     // Added 1 trials to the tester
     
     simulatorTester.run(1);
     System.out.println("After run (1):");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
     // Added 10 trials to the tester
     
     simulatorTester.run(10);
     System.out.println("After run (10):");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
     // Added 100 trials to the tester
     
     simulatorTester.run(100);
     System.out.println("After run (100):");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
     // Added 200 trials to the tester
     
     simulatorTester.run(200);
     System.out.println("After run (200):");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
     // Added 50 trials to the tester
     
     simulatorTester.run(50);
     System.out.println("After run (50):");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
     // run Reset menthod
     
     simulatorTester.reset();
     System.out.println("After reset: ");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
     // Added 1000 trials to the tester
     
     simulatorTester.run(1000);
     System.out.println("After run (1000):");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
     // Added 350 trials to the tester
     
     simulatorTester.run(350);
     System.out.println("After run (350):");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
     // Added 150 trials to the tester
     
     simulatorTester.run(150);
     System.out.println("After run (150):");
     System.out.print("Number of trials: ");
     System.out.println(simulatorTester.getNumTrials());
     System.out.print("Two-head tosses: ");
     System.out.println(simulatorTester.getTwoHeads());
     System.out.print("Two-tail tosses: ");
     System.out.println(simulatorTester.getTwoTails());        
     System.out.print("One-head one-tail tosses: ");
     System.out.println(simulatorTester.getHeadTails());        
     System.out.print("Tosses add up correctly? ");
     CoinTossSimulatorTester.tossAdditionTester(simulatorTester.getTwoHeads(), 
             simulatorTester.getTwoTails(), simulatorTester.getHeadTails(),
             simulatorTester.getNumTrials());
     System.out.println();
     
    }
    
   
}
