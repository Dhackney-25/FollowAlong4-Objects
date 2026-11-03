package part17;

class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    public Car() {
    }

    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}

