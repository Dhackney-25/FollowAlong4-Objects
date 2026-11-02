package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10635s
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the two methods below. Then run ChallengeTest until every
// test is green. Change only the lines marked YOUR CODE.
// You learned everything you need for these in parts 06 and 07: if, else, &&, ||, %.

public class Challenge {
    public static int partyRating(int snacks, int drinks) {
        if (snacks < 5 || drinks < 5) {
            return 0;
        } else if (snacks >= drinks * 2 || drinks >= snacks * 2) {
            return 2;
        } else {
            return 1;
        }
    }

    // Count-off game.
    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}
