import java.io.*;
import java.util.*;

public class D_Game implements Game {
	@Override
	public void Play() throws Exception{
		// Play die game:

      	// Play the main game phase
      	mainDieGame();

      	// Now see if (s)he has won!
      	declareDieGameWinner();
	}

	// The BufferedReader used throughout
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  // The random number generator used throughout
  public static RandomInterface r = new LinearCongruentialGenerator();

  //Variable(s) used in the die game methods
  public static HashSet<Integer> numbersRolled = new HashSet<Integer>();

	public static void mainDieGame() throws Exception {
    	// The main game:

    	// Let the user roll the die twice
    	for (int i = 0; i < 2; i++) {
        	System.out.println("Hit <RETURN> to roll the die");
        	br.readLine();
        	int dieRoll = (int)(r.next() * 6) + 1;

        	System.out.println("You rolled " + dieRoll);
        	numbersRolled.add(new Integer(dieRoll));
    	}

    	// Display the numbers rolled
    	System.out.println("Numbers rolled: " + numbersRolled);
  }

  public static void declareDieGameWinner() throws Exception {
    // Declare the winner:

   	// User wins if at least one of the die rolls is a 1
   	if (numbersRolled.contains(new Integer(1))) {
     	System.out.println("You won!");
   	} else {
   		System.out.println("You lost!");
  	}	
  }
}