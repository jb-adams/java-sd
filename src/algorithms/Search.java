package algorithms;

public class Search {

    public static int linearSearch(int[] dataset, int target) {
        // iterate through dataset searching for target
        for (int i=0; i<dataset.length; i++) {
            if (dataset[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] dataset, int target, int start, int end) {
        // binary search assumes a sorted array and can therefore continually split our search
        // domain in half

        int middle = (int) Math.floor(((start+end)/2));
        int value = dataset[middle];

        //System.out.println("middle value: " + value);

        if (target < value) {
            return binarySearch(dataset, target, start, middle-1);

        }
        else if (target > value) {
            return binarySearch(dataset, target, middle+1, end);
        }
        return middle;
    }
}
