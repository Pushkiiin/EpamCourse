package hackerrank30days.day26;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(fee());
    }

    public static int fee(){
        Scanner sc = new Scanner(System.in);
        int actDay = sc.nextInt();
        int actMonth = sc.nextInt();
        int actYear = sc.nextInt();
        int expDay = sc.nextInt();
        int expMonth = sc.nextInt();
        int expYear = sc.nextInt();

        if(actYear == expYear){
            if(actMonth == expMonth){
                return actDay <= expDay ? 0 : 15*(actDay - expDay);
            } else {
                return actMonth < expMonth ? 0 : 500*(actMonth - expMonth);
            }
        } else {
            return actYear < expYear ? 0 : 10000;
        }
    }
}