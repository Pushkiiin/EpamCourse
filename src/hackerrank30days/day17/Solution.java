package hackerrank30days.day17;

import java.util.Scanner;

class  Calculator{
    int power (int num, int pow) throws ArithmeticException{
        if(num < 0 || pow < 0){
            throw new ArithmeticException("n and p should be non-negative");
        }
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }
}

class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

