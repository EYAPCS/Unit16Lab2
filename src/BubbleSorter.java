import java.util.Arrays;

/**
 * Created by emma on 7/18/17.
 */

/**
 * Iteratively bubble sorts a list of integers
 */

public class BubbleSorter {

    public static int[] bubbleSort(int[] nums) {

        int[] myArray = nums;
        for(int j = 0; j < myArray.length; j++) {
            for(int i = 0; i < myArray.length - 1; i++) {

                if (myArray[i] > myArray[i + 1]) {

                    int temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;

                }

            }
        }
        return myArray;

    }

    public static void main(String[] args) {

        int[] ar = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = bubbleSort(ar);
        for(int i : sorted) {
            System.out.println(i);
        }

    }

}
