package part16;
import java.util.Random;

public class DiceRoller {
    // Declares a Random variable used to generate random numbers.
    Random random;
    // Declares an integer variable to store the dice roll.
    int number;
    // Creates the constructor for the DiceRoller class.
    DiceRoller(){
        // Creates a new Random object.
        random = new Random();
        // Calls the roll method when a DiceRoller object is created.
        roll();
    }
    // Defines a method that rolls the dice.
    void roll(){
// Generates a random number from 1 to 6.
        number = random.nextInt(6) + 1;
        // Prints the dice roll result.
        System.out.println(number);
    }
}
