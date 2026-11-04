package part17;

class Car {
    // Sets the default make of the car to Ford.
    String make = "Ford";
    // Sets the default model of the car to Mustang.
    String model = "Mustang";
    // Sets the default color of the car to red.
    String color = "red";
    // Sets the default year of the car to 2021.
    int year = 2021;
    // Creates a constructor that allows a car to be created with default values.
    public Car() {
    }
    // Creates a constructor that accepts the make, model, color, and year.
    public Car(String make, String model, String color, int year) {
        // Sets the car's make to the value passed into the constructor.
        this.make = make;
        // Sets the car's model to the value passed into the constructor.
        this.model = model;
        // Sets the car's color to the value passed into the constructor.
        this.color = color;
        // Sets the car's year to the value passed into the constructor.
        this.year = year;
    }
    // Creates a method that returns the car's information as a String.
    public String toString() {
        // Returns the make, model, color, and year on separate lines.
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}

