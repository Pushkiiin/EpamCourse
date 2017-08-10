package hackerrank30days.day10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int maxCount = 0;
        while (n > 0){
            if(n%2 == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            } else{
                count = 0;
            }
            n /= 2;
        }
        System.out.println(maxCount);
    }
}
