package homework.from170704.radix;

import java.util.Random;

public class RadixSort {
    private static final int RADIX = 10;        //range of one digit values
    private static final int VAL_RANGE = 100;   //range of number values in array

    public static void radixSort(int[] arr) {
        for (int digit = 1; digit < VAL_RANGE; digit *= RADIX) {
            countSort(arr, digit);
        }
    }

    //stable digits sort - required for radix
    public static void countSort(int[] arr, int digit) {
        int[] counters = new int[RADIX];
        int[] tmp = new int[arr.length];

        for (int val : arr) {
            counters[(val / digit) % RADIX]++;
        }

        for (int i = 1; i < counters.length; i++) {
            counters[i] += counters[i - 1];
        }

        for (int i = tmp.length - 1; i >= 0; i--) {
            tmp[--counters[(arr[i] / digit) % RADIX]] = arr[i];                 //this line took more time then rest of the program
        }

        System.arraycopy(tmp, 0, arr, 0, tmp.length);
    }

}

