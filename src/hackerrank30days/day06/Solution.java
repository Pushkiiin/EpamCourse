package hackerrank30days.day06;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cases; i++) {
            String str = sc.nextLine();
            String result1 = "";
            String result2 = "";
            for (int j = 0; j < str.length(); j++) {
                if(j%2 == 0){
                    result1 += str.charAt(j);
                } else {
                    result2 += str.charAt(j);
                }
            }
            System.out.println(result1 + " " + result2);
        }
    }
}
