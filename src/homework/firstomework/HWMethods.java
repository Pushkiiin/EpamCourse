package homework.firstomework;

public class HWMethods {
    //sign(int a) - высисление знака числа: -1 если отрицательно, 1 если положительное, 0 если 0
    static int sign(int a){
        if (a < 0)
            return -1;
        if(a > 0)
            return 1;
        return 0;
    }

    //mod(int a, int b) - вычисление отстатка от деления нацело, не используя оператор %
    public static int mod(int a, int b) {
        if(a < 0 || b <= 0){
            System.out.println("Dividend has to be non-negative; divider has to be positive");
            return -1;   //idk actually how to handle this properly, don't know much about exceptions
        }
        while(a >= b){
            a -= b;
        }
        return a;
    }

    //isPrime(int a) - если число простое, вернуть true, иначе false
    public static boolean isPrime(int a){
        if (a <= 1){
            System.out.println("a has to be >= 2 by definition");
            return false;
        }
        for (int i = 2; i*i <= a; i++) {
            if(a % i == 0)
                return true;
        }
        return false;
    }

    //isFibonacci(int a) - если это число из ряда Фибоначчи - вернуть true, иначе false
    public static boolean isFibonacci(int a){
        if(a <= 0){
            System.out.println("a has to be positive");
            return false;
        }
        int prev = 1;
        int sum = 1;
        while (sum < a) {
            sum += prev;
            prev = sum - prev;
            if(prev > sum)      //handling exceeding Integer.MAX_VALUE
                break;
        }
        return sum == a;
    }
}
