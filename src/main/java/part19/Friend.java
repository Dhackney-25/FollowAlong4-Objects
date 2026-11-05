package part19;

public class Friend {
    // Creates a String variable to store each friend's name.
    String name;
    // Creates a static variable that keeps track of the total number of friends.
    static int numberOfFriends;
    // Creates a constructor that accepts a friend's name.
    static String newestFriend;
    Friend(String name) {
        // Assigns the name passed into the constructor to the object's name variable.
        this.name = name;
        // Increases the total number of friends by 1 each time a Friend object is created.
        numberOfFriends++;
        newestFriend = name;
    }
    // Creates a static method to display the total number of friends.
    static void displayFriends() {
        // Prints the current number of friends.
        System.out.println("You have " + numberOfFriends + " friends");
    }
}