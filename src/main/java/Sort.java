/**
 * This class implements multiple sort algorithms.
 *
 * @author Garv Seth
 * @version (CSSSKL 143)
 */

public class Sort {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] bubbleArray = new int[SIZE];
        int[] selectionArray = new int[SIZE];
        int[] insertionArray = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            bubbleArray[i] = (int) (Math.random() * 52);
            selectionArray[i] = (int) (Math.random() * 52);
            insertionArray[i] = (int) (Math.random() * 52);
        }

        System.out.println("Array before bubble sort:");
//        System.out.println(Arrays.toString(bubbleArray));
        bubbleSort(bubbleArray);
        System.out.println("Array after bubble sort:");
//        System.out.println(Arrays.toString(bubbleArray));
        System.out.println();

//        System.out.println("Array before selection sort:");
//        System.out.println(Arrays.toString(selectionArray));
//        selectionSort(selectionArray);
//        System.out.println("Array after selection sort:");
//        System.out.println(Arrays.toString(selectionArray));
//        System.out.println();
//
//        System.out.println("Array before insertion sort:");
//        System.out.println(Arrays.toString(insertionArray));
//        insertionSort(insertionArray);
//        System.out.println("Array after insertion sort:");
//        System.out.println(Arrays.toString(insertionArray));

        // TODO Test your string sort here

        /*
         System.out.println("Array before bubble sort:");
        System.out.println(Arrays.toString(bubbleArray));
        bubbleSort(bubbleArray);
        System.out.println("Array after bubble sort:");
        System.out.println(Arrays.toString(bubbleArray));

        String[] stringArray = {"apple", "orange", "banana", "pear", "grape"};
        System.out.println("Array before bubble sort:");
        System.out.println(Arrays.toString(stringArray));
        bubbleSort(stringArray);
        System.out.println("Array after bubble sort:");
        System.out.println(Arrays.toString(stringArray));
        */

    }

    /**
     *
     * @param numbers
     */
    public static void bubbleSort(int[] numbers) {
        boolean swapped;
        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps were made
        }
    }


    /**
     *
     *
     * @param numbers
     * @param indexA
     * @param indexB
     */
    public static void swap(int[] numbers, int indexA, int indexB) {
        int temp = numbers[indexA];
        numbers[indexA] = numbers[indexB];
        numbers[indexB] = temp;
    }

    public static void bubbleSort(String[] strings) {
        boolean swapped;
        for (int i = 0; i < strings.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    swap(strings, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps were made
        }
    }

    public static void swap(String[] strings, int indexA, int indexB) {
        String temp = strings[indexA];
        strings[indexA] = strings[indexB];
        strings[indexB] = temp;
    }


    // selection sort for ints
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = findSmallest(numbers, i, numbers.length);
            swap(numbers, i, minIndex);
        }
    }

    public static int findSmallest(int[] arr, int begin, int end) {
        int minIndex = begin;
        int minValue = arr[begin];
        for (int i = begin + 1; i < end; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    /**
     *
     * @param numbers
     */
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
    }
}
