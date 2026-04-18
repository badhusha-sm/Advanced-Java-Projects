package Collections_Framework;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 30); // Key: "Alice", Value: 30
        map.put("Bob", 25);   // Key: "Bob", Value: 25
        map.put("Charlie", 35); // Key: "Charlie", Value: 35

        // Retrieving a value using a key
        int ageOfBob = map.get("Bob");
        System.out.println("Bob's age: " + ageOfBob); // Output: Bob's age: 25

        // Modifying a value
        map.put("Alice", 31); // Updating Alice's age

        // Removing a key-value pair
        map.remove("Charlie");

        // Displaying the contents of the HashMap
        System.out.println(map); // Output: {Alice=31, Bob=25}
    }
}
