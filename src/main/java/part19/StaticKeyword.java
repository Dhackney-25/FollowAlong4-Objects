package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.

public class StaticKeyword {
    public static void main(String[] args) {
        // Prints the current number of friends.
        System.out.println(Friend.numberOfFriends);
        // Creates a Friend object named friend1 with the name SpongeBob.
        Friend friend1 = new Friend("SpongeBob");
        // Creates a Friend object named friend2 with the name Patrick.
        Friend friend2 = new Friend("Patrick");
        // Creates a Friend object named friend3 with the name Squidward.
        Friend friend3 = new Friend("Squidward");
        // Calls the displayFriends() method to show the total number of friends.
        Friend.displayFriends();
        // Creates another Friend object named friend4 with the name Sandy.
        Friend friend4 = new Friend("Sandy");
        // Calls displayFriends() again to show the updated number of friends.
        Friend.displayFriends();
        // Rounds 3.14 to the nearest whole number and prints the result.
        System.out.println(Math.round(3.14));
    }
}