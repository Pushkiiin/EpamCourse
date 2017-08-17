package hackerrank30days.day25;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            String answer = nums[i] < 2 ? "Not prime" : "Prime";
            for (int j = 2; j*j <= nums[i]; j++) {
                if(nums[i]%j == 0){
                    answer = "Not prime";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}

