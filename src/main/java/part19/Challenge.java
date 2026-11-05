package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        (these are static methods — you call them with the class name, like Math.round)
//
// SECTION D — Challenge. Two methods plus a helper. The test in src/test/java/part19/ChallengeTest.java
// checks all three. Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // Rounds each number to the nearest 10 and adds them together.
    public static int roundedTotal(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    // Rounds a number to the nearest 10.
    public static int round10(int n) {
        return ((n + 5) / 10) * 10;
    }

    // Checks whether the small and big bricks can make the exact goal length.
    public static boolean canBuildWall(int small, int big, int goal) {
        int bigUsed = Math.min(big, goal / 5);
        int remaining = goal - (bigUsed * 5);

        return small >= remaining;
    }
}