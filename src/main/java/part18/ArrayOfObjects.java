package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        starts at about 3:38:40 — stop at about 3:44:15, at "that's the basics of arrays of objects"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 18, topic 1 — an array of objects
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayOfObjects.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Food. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Food.java too.

public class ArrayOfObjects {
    public static void main(String[] args){
        // Creates a Food object named food1 with the name "pizza".
        Food food1 = new Food("pizza");
        // Creates a Food object named food2 with the name "hamburger".
        Food food2 = new Food("hamburger");
        // Creates a Food object named food3 with the name "hot dog".
        Food food3 = new Food("hot dog");
        // Creates an array named refrigerator that stores all three Food objects.
        Food[] refrigerator = {food1, food2, food3};
        // Prints the name of the first Food object in the array (pizza).
        System.out.println(refrigerator[0].name);
        // Prints the name of the second Food object in the array (hamburger).
        System.out.println(refrigerator[1].name);
        // Prints the name of the third Food object in the array (hot dog).
        System.out.println(refrigerator[2].name);
    }
}
