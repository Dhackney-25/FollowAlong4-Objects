package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Quarterback needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Quarterback { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Quarterback{
    // Stores the quarterback's name.
        private String name;
    // Stores the maximum distance the quarterback can throw.
        private int armStrength;
    // Tracks the total number of passes attempted.
        private int attempts;
    // Tracks the number of successful passes.
        private int completions;
    // Tracks the total passing yards.
        private int passingYards;
    // Constructor that creates a quarterback.
        public Quarterback(String name, int armStrength) {
            // Sets the quarterback's name.
            this.name = name;
            // Sets the quarterback's arm strength.
            this.armStrength = armStrength;
        }
    // Getter that returns the quarterback's name.
        public String getName() {
            // Gives back the name.
            return name;
        }
    // Getter that returns the number of attempts.
        public int getAttempts() {
            // Gives back the attempts.
            return attempts;
        }
    // Getter that returns the number of completions.
        public int getCompletions() {
            // Gives back the completions.
            return completions;
        }
    // Getter that returns the total passing yards.
        public int getPassingYards() {
            // Gives back the passing yards.
            return passingYards;
        }
    // Throws a pass to a receiver for a certain distance.
        public boolean throwTo(Receiver target, int yards) {
            // Increases the number of attempts by 1.
            attempts++;
            // Checks if the pass is farther than the quarterback can throw.
            if (yards > armStrength) {
                // Prints the quarterback and receiver names.
                System.out.println(name + " -> " + target.getName()
                        // Prints the distance and incomplete result.
                        + ", " + yards + " yards: INCOMPLETE");
                // Returns false because the pass was incomplete.

                return false;
            }
            // Increases the number of completed passes by 1.
            completions++;
            // Adds the yards from the pass to the total.
            passingYards += yards;
// Updates the receiver's catches and yards.
            target.catchBall(yards);
            // Prints the quarterback and receiver names.
            System.out.println(name + " -> " + target.getName()
                    // Prints the distance and caught result.
                    + ", " + yards + " yards: CAUGHT");
// Returns true because the pass was caught.
            return true;
        }
    // Calculates the percentage of completed passes.
        public int completionPercentage() {
            // Checks if the quarterback has attempted any passes.
            if (attempts == 0) {
                // Returns 0 if there are no attempts.
                return 0;
            }
            // Calculates the completion percentage.
            return (completions * 100) / attempts;
        }
    // Creates a readable summary of the quarterback's statistics.
        public String toString() {
            // Adds the name and completions out of attempts.
            return name + ": " + completions + "/" + attempts
                    // Adds the total passing yards.
                    + ", " + passingYards + " yards, "
                    // Adds the completion percentage.
                    + completionPercentage() + "%";
        }
    // Creates another version of throwTo with fewer parameters.
        public boolean throwTo(Receiver target) {
            // Calls the original method using a 10-yard pass.
            return throwTo(target, 10);
        }
    }

