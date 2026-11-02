package part16;

public class Human {
    // Declares a String variable to store the human's name.
        String name;
    // Declares an integer variable to store the human's age.
    int age;
    // Declares a double variable to store the human's weight.
        double weight;
    // Creates a constructor that accepts a name, age, and weight.
        Human(String name, int age, double weight) {
            // Assigns the given name to the object's name variable.
            this.name = name;
            // Assigns the given age to the object's age variable.
            this.age = age;
            // Assigns the given weight to the object's weight variable.
            this.weight = weight;
        }
    // Defines a method that represents the human eating.
    // Prints the human's name followed by "is eating".
        void eat() {
            System.out.println(this.name + " is eating");
        }
    // Defines a method that represents the human drinking.
    // Prints the human's name followed by "is drinking *burp*".
        void drink() {
            System.out.println(this.name + " is drinking *burp*");
        }
    }
