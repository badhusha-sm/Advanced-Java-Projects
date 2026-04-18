package Collections_Framework;

import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store Integer values
       ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Printing the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Accessing an element
        int firstElement = numbers.get(0);
        System.out.println("First Element: " + firstElement); // Output: 10

        // Iterating through the ArrayList
        System.out.print("All Elements: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Removing an element
        numbers.remove(2); // Removes the element at index 2 (30)
        System.out.println("After Removal: " + numbers);
    }
}