package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Receiver needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Receiver { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Receiver{
    // Stores the receiver's name.
    private String name;
    // Stores the receiver's jersey number.
    private int number;
    // Keeps track of the number of catches.
    private int catches;
    // Keeps track of the total yards gained.
    private int yards;
    // Constructor that creates a receiver.
    public Receiver(String name, int number) {
        // Sets the receiver's name.
        this.name = name;
        // Sets the receiver's jersey number.
        this.number = number;
    }
    // Getter that returns the receiver's name.
    public String getName() {
        // Gives back the name.
        return name;
    }
// Getter that returns the receiver's jersey number.
    public int getNumber() {
        // Gives back the jersey number.
        return number;
    }
    // Getter that returns the number of catches.
    public int getCatches() {
        // Gives back the catch total.
        return catches;
    }
    // Getter that returns the total yards gained.
    public int getYards() {
        // Gives back the yard total.
        return yards;
    }
    // Records when the receiver catches a pass.
    public void catchBall(int gain) {
        // Increases the catch count by 1.
        catches++;
        // Adds the yards from the catch to the total.
        yards += gain;
    }
    // Creates a readable description of the receiver.
    public String toString() {
        // Adds the jersey number and receiver's name.
        return "#" + number + " " + name + ": "
                // Adds the catches and total yards.
                + catches + " catches, " + yards + " yards";
    }
}

