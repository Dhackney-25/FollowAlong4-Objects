package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type Human -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.

public class Constructors {
    public static void main(String[] args){
        // Creates the first Human object with the name Rick, age 65, and weight 70.
        Human human1 = new Human("Rick", 65, 70);
        // Creates the second Human object with the name Morty, age 16, and weight 50.
        Human human2 = new Human("Morty", 16, 50);
        // Prints the name of the first human.
        System.out.println(human1.name);
        // Prints the name of the second human.
        System.out.println(human2.name);
        // Calls the eat method for human1.
        human1.eat();
        // Calls the drink method for human2.
        human2.drink();
    }
}
