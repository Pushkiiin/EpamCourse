package hackerrank30days.day16;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        } catch (IllegalArgumentException e) {
            System.out.println("Bad String");
        }
    }
}
