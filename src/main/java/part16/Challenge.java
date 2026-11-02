package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the two methods below. Then run ChallengeTest until every
// test is green. Change only the lines marked YOUR CODE.
// You need a for loop (part 08) and String methods like charAt and indexOf (part 11).

public class Challenge {

    public static String doubleLetters(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i);
            result += s.charAt(i);
        }

        return result;
    }

    // Count how many times word appears in s without counting overlaps.
    public static int countWord(String s, String word) {
        int count = 0;
        int index = 0;

        while ((index = s.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }
}