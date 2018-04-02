package datastructures;

import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        // LinkedHashSet prints elements in the order they were added
        // HashSet is complete random order
        // TreeSet rearranges to natural order (alphabetical or numerical)

        // 1. Define the collection
        Set<String> animals = new TreeSet<String>();

        // 2. Adding elements
        animals.add("dog");
        animals.add("pig");
        animals.add("hog");
        animals.add("cat");
        animals.add("snake");
        System.out.println(animals + " " + animals.size());

        animals.add("cat");
        animals.add("snake");
        animals.add("goose");
        System.out.println(animals + " " + animals.size());

        // Create a new set that we use for comparison
        Set<String> farmAnimals = new HashSet<String>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("horse");
        farmAnimals.add("dog");

        // What is the INTERSECTION between animals and farm animals?
        // 1. Copy existing set into a new set
        Set<String> intersectionSet = new HashSet<String>(animals);
        System.out.println(intersectionSet);
        // 2. Retain ONLY the elements that are also in the other set
        intersectionSet.retainAll(farmAnimals);
        System.out.println("The intersection is: " + intersectionSet);

        // What is the UNION
        Set<String> unionSet = new HashSet<String>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is: " + unionSet);

        // What is the DIFFERENCE (in animals but not in farm animals)
        Set<String> differenceSet = new HashSet<String>(animals);
        differenceSet.removeAll(farmAnimals);
        System.out.println("The difference is: " + differenceSet);

    }
}
