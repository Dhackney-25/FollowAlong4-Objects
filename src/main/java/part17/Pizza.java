package part17;

public class Pizza {
// Stores the type of bread or crust for the pizza.
    String bread;
    // Stores the type of sauce for the pizza.
    String sauce;
    // Stores the type of cheese for the pizza.
    String cheese;
    // Stores the topping for the pizza.
    String topping;
    // Constructor that accepts all four pizza ingredients.
    Pizza(String bread, String sauce, String cheese, String topping) {
        // Sets the pizza's bread.
        this.bread = bread;
        // Sets the pizza's sauce.
        this.sauce = sauce;
        // Sets the pizza's cheese.
        this.cheese = cheese;
        // Sets the pizza's topping.
        this.topping = topping;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
// Constructor that accepts bread, sauce, and cheese.
    Pizza(String bread, String sauce) {
        // Sets the pizza's bread.
        this.bread = bread;
        // Sets the pizza's sauce.
        this.sauce = sauce;
    }
// Constructor that accepts only bread.
    Pizza(String bread) {
        // Sets the pizza's bread.
        this.bread = bread;
    }
// Default constructor that creates a pizza with no ingredients specified.
    Pizza() {
        // Creates a pizza with thin crust, tomato sauce, cheddar cheese, and olives.
        Pizza mine = new Pizza("thin crust", "tomato", "cheddar", "olives");
        // Prints the pizza's information using its toString() method.
        System.out.println(mine);

    }

    }

