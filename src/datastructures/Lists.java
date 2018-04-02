package datastructures;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        // 1. Create a collection
        ArrayList<String> cities = new ArrayList<String>();

        // 2. Add new elements
        cities.add("Cleveland");
        cities.add("Toronto");
        cities.add("Chicago");
        cities.add("Miami");

        // 3. Iterate through the collection
        for (String city : cities) {
            System.out.println(city);
        }

        // 4. Get the size
        int size = cities.size();
        System.out.println("There are " + size + " elements in the collection");

        // 5. Retrieve specific elements
        System.out.println(cities.get(2));

        // 6. Remove
        cities.remove(0);
        size = cities.size();
        System.out.println("Now, there are " + size + " elements in the collection");

        for (String city : cities) {
            System.out.println(city);
        }

    }
}
