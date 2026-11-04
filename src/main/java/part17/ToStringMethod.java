package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        starts at about 3:32:20 — stop at about 3:38:30, at "that's how the toString method works"
// Guide: GUIDE.md in this folder, steps 8–12
//
// Part 17, topic 2 — the toString method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ToStringMethod.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Car.java too.

public class ToStringMethod {
    public static void main(String[] args) {
        // Creates a new Car object using the default constructor.
        Car car = new Car();
        // Prints the make of the car.
        System.out.println(car.make);
        // Prints the model of the car.
        System.out.println(car.model);
        // Prints the color of the car.
        System.out.println(car.color);
        // Prints the year the car was made.
        System.out.println(car.year);
        // Calls the toString() method and prints the car's information.
        System.out.println(car.toString());
        // Prints the car object; Java automatically calls its toString() method.
        System.out.println(car);
    }
}

