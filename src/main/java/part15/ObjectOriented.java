package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        starts at about 2:59:30 — stop at about 3:09:48, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 15, video 2 — objects (object-oriented programming)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called ObjectOriented.
//    Leave the "package part15;" line and the "public class ObjectOriented" line alone.
//    He also makes a second class called Car. YOU make that file too:
//    right-click the part15 folder -> New -> Java Class -> type Car -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Car.java, saying in YOUR OWN WORDS what that line does.

public class ObjectOriented {
    public static void main(String[] args){
        // Creates the first Car object named myCar1.
                Car myCar1 = new Car();
        // Creates the second Car object named myCar2.
                Car myCar2 = new Car();
        // Prints the make of the first car.
                System.out.println(myCar1.make);
        // Prints the model of the first car.
                System.out.println(myCar1.model);
        // Prints a blank line.
                System.out.println();
        // Prints the make of the second car.
                System.out.println(myCar2.make);
        // Prints the model of the second car.
                System.out.println(myCar2.model);
        // Calls the drive method for the first car.
                myCar1.drive();
        // Calls the brake method for the first car.
                myCar1.brake();
            }
        }
