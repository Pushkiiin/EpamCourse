package homework.from170704.radix;

import java.util.Random;

//class with auxiliary methods to generate and print an array
class ArrHelper{
    public int[] generate(int len, int range) {
        int[] arr = new int[len];
        Random rnd = new Random();

        for (int i = 0; i < len; i++) {
            arr[i] = rnd.nextInt(range);
        }
        return arr;
    }

    public String toString(int[] arr) {
        String result = "";
        for (int i : arr) {
            result += i + " ";
        }
        return result;
    }
}
