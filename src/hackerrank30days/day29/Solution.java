package hackerrank30days.day29;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner((System.in));
        int t = sc.nextInt();
        for (int iter = 0; iter < t; iter++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int maxAnd = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if((i&j) > maxAnd && (i&j) < k){
                        maxAnd = i&j;
                    }
                }
            }
            System.out.println(maxAnd);
        }
    }
}
