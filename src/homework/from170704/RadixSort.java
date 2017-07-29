package homework.from170704;

import java.util.Random;

public class RadixSort {
    private static final int RADIX = 10;
    private static final int ARR_SIZE = 100_000;
    private static final int VAL_RANGE = 100;

    public static void main(String[] args) {
        ArrHelper ah = new ArrHelper();
        int[] arr = ah.generate(ARR_SIZE, VAL_RANGE);

        System.out.println(ah.toString(arr));
        radixSort(arr);
        System.out.println(ah.toString(arr));

    }

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
            tmp[--counters[(arr[i] / digit) % RADIX]] = arr[i];                 //this line took more time then rest of this program
        }

        System.arraycopy(tmp, 0, arr, 0, tmp.length);
    }

}

//class with auxiliary methods to generate and print an array
class ArrHelper{
    public int[] generate(int len, int range) {
        int[] arr = new int[len];
        Random rnd = new Random();

        for (int i = 0; i < len; i++) {
            arr[i] = rnd.nextInt(range);
        }
        return arr;
    }

    public String toString(int[] arr) {
        String result = "";
        for (int i : arr) {
            result += i + " ";
        }
        return result;
    }
}