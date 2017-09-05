package classwork.lesson170704;

public class VarArgs {
    public static void main(String[] args) {

//        int x = sum(0);
        System.out.println(sum(0,1));

    }

    private static int sum(int first, int second, int... params) {
        int sum = 0;
        for (int value : params) {
            sum += value;
        }
        return sum;
    }
}
