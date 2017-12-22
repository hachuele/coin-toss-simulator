# Coin Toss Simulator

In this assignment, I wrote a graphics-based program to simulate the tossing of a pair of coins some number of times (specified through the command-line), and display the results as a simple bar chart.

The assignment's purpose was to give the student practice with creating and implementing classes, using loops, using the java library for random number generation, doing console-based IO, drawing to a graphics window, and overall general program development.



## Program Details 

The program begins by prompting the user for the number of trials to simulate (a trial is two
coin tosses) on the console, error checking that a positive value is entered.

Then, the program runs the simulation and displays a 500 tall by 800 wide pixel window with the results of that simulation. The results consist of three labeled bars, each a different color, to show how many trials had the specified outcome, as shown below (sample input and output):

```
Enter number of trials: - 5
ERROR: Number entered must be greater than 0.
Enter number of trials: 0
ERROR: Number entered must be greater than 0.
Enter number of trials: 1000
```

![sample-output-pa1](C:\Users\Eric\Google Drive\All\School\USC\Class Material\CSCI_455\Programming_Assigments\CSCI455_Assignment_1\sample-output-pa1.png)

