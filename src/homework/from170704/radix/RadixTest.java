package homework.from170704.radix;


import java.util.Arrays;

public class RadixTest {

    private static final int ARR_SIZE = 1_000_000;
    private static final int VAL_RANGE = 1_000_000;   //range of number values in array

    //here we can see radix sort being 1.5-2 times faster than Arrays.sort() on these arguments
    public static void main(String[] args) {
        ArrHelper ah = new ArrHelper();
        int[] arr = ah.generate(ARR_SIZE, VAL_RANGE);
        int[] arr2 = Arrays.copyOf(arr, ARR_SIZE);

        long startTime, finishTime, diff;

        startTime = System.currentTimeMillis();
        RadixSort.radixSort(arr, VAL_RANGE);
        finishTime = System.currentTimeMillis();
        diff = finishTime - startTime;
        System.out.println("Radix sort: " + diff + " ms");

        startTime = System.currentTimeMillis();
        Arrays.sort(arr2);
        finishTime = System.currentTimeMillis();
        diff = finishTime - startTime;
        System.out.println("Standard sort: " + diff + " ms");
    }
}
