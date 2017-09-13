package homework.from170811;

import java.util.Arrays;
import java.util.Random;

//make binSearch return -[index] in case of key not found
public class MyBinarySearch {
    private static final int SIZE = 30;
    private static final int RANGE = 30;

    public static void main(String[] args) {
        int[] arr = new int[SIZE];
        Random rnd = new Random();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = Math.abs(rnd.nextInt()%RANGE);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr, -1));
        System.out.println(search(arr, 1));
        System.out.println(search(arr, 11));
        System.out.println(search(arr, 110));
    }

    public static int search(int[] arr, int key){
        int lo = 0;
        int hi = arr.length - 1;
        int mid = lo + (hi - lo)/2;
        while(lo <= hi){
            mid = lo + (hi - lo)/2;
            if(key < arr[mid]){
                hi = mid - 1;
            } else if(key > arr[mid]){
                lo = mid + 1;
            } else return mid;
        }
        return -mid;
    }
}
