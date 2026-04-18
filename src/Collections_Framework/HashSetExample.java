package Collections_Framework;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store String values
        HashSet<String> colors = new HashSet<>();

        // Adding elements to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red"); // Duplicate, will not be added

        // Printing the HashSet
        System.out.println("HashSet: " + colors); // The order may vary

        // Checking for an element
        boolean hasBlue = colors.contains("Blue");
        System.out.println("Contains Blue? " + hasBlue); // Output: true

        // Iterating through the HashSet
        System.out.print("All Colors: ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        // Removing an element
        colors.remove("Green");
        System.out.println("After Removal: " + colors);
    }
}
