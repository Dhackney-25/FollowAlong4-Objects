package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        (no video for the challenge — it uses arrays, from part 10)
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part17/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {
    public static int sumSkip13(int[] nums) {
        int sum = 0;
        boolean skipNext = false;

        for (int num : nums) {
            if (skipNext) {
                skipNext = false;
            } else if (num == 13) {
                skipNext = true;
            } else {
                sum += num;
            }
        }

        return sum;
    }

    public static boolean hasPair(int[] nums, int value) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == value && nums[i + 1] == value) {
                return true;
            }
        }

        return false;
    }
}
