package hackerrank30days.day7;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        System.out.print(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }
    }
}
