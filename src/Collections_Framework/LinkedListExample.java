package Collections_Framework;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store String values
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Printing the LinkedList
        System.out.println("LinkedList: " + fruits);

        // Accessing elements
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit); // Output: Apple

        // Iterating through the LinkedList
        System.out.print("All Fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Removing an element
        fruits.remove(1); // Removes "Banana"
        System.out.println("After Removal: " + fruits);
    }
}