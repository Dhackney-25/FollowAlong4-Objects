package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part20/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    public static int ticketResult(int a, int b, int c) {
        if (a == b && b == c) {
            return 10;
        }

        if (a != b && a != c) {
            return 5;
        }

        return 0;
    }

    // Checks if x and y appear the same number of times inside s.
    public static boolean sameCount(String s, String x, String y) {
        return countOccurrences(s, x) == countOccurrences(s, y);
    }

    // Counts how many times a substring appears inside a string.
    public static int countOccurrences(String s, String target) {
        int count = 0;

        if (target.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= s.length() - target.length(); i++) {
            if (s.substring(i, i + target.length()).equals(target)) {
                count++;
            }
        }

        return count;
    }
}