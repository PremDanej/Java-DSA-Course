package ArrayList;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {

        // Declaring & Initializing
        ArrayList<Integer> intList = new ArrayList<>();

        // Add
        intList.add(10);
        intList.add(30);
        intList.add(40);

        // Add at index
        intList.add(1,50);

        // Get
        System.out.println(intList.get(2));

        // Set
        intList.set(3, 60);

        // Remove
        intList.remove(0);

        // Size
        System.out.println(intList.size());

        // Display
        System.out.println(intList);
    }
}
