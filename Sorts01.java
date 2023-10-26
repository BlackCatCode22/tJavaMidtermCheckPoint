import java.util.Random;

public class Sorts01 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("\n\nWelcome to my Sorts program!\n\n");

        long startTime = System.currentTimeMillis();
        long stopTime = System.currentTimeMillis();

        // Create an array of ints
        int arraySize = 10;
        int[] myRandomArray = new int[arraySize];

        // Create a Random object!
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++) {
            myRandomArray[i] = rand.nextInt(1000);
        }

        // Print the random array to see if it's working.
        for (int i = 0; i < arraySize; i++){
            System.out.println(myRandomArray[i]);
        }

        // Call the bubble sort() and print the array.
        bubbleSort(myRandomArray);

        // the array should now be sorted!
        for (int i = 0; i < arraySize; i++){
            System.out.println(myRandomArray[i]);
        }


    }

    // the Bubble Sort Method
    // do while loop created by ChatGPT!
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                // Swap if the element found is greater than the next element
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--; // Reduce the range of elements to sort in each pass
        } while (swapped);
    }


}