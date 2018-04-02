package algorithms;

public class Demo {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 433, 26, 73, 132, 5};
        int[] sortedNumbers = {5, 9, 12, 18, 21, 26, 29, 35, 39, 45, 49, 51, 58, 59, 61, 72, 88, 91, 94};

        // Call the linear function that searches for a specific number
        System.out.println("Linear Search");
        int pos = Search.linearSearch(numbers,73);
        System.out.println("Found at position: " + pos);

        // Call the binary search
        System.out.println("Binary Search");
        pos = Search.binarySearch(sortedNumbers, 59, 1, sortedNumbers.length);
        System.out.println("Found at position: " + pos);

        // Call the bubble sort function
        System.out.println("Bubble Sort");
        Sort.bubbleSort(numbers);


    }
}
