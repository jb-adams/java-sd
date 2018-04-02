package algorithms;

public class Sort {

    public static void bubbleSort(int[] dataset) {
        int changesMade;
        int whileCount = 0;

        do {
            System.out.println("Iteration of while loop: " + whileCount);
            changesMade = 0;

            for (int i=0; i<dataset.length-1; i++) {
                if (dataset[i] > dataset[i+1]) {
                    changesMade ++;

                    int tempA = dataset[i];
                    int tempB = dataset[i+1];
                    dataset[i] = tempB;
                    dataset[i+1] = tempA;
                    printArray(dataset);
                }
            }

            whileCount++;
        } while (changesMade > 0);

    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
