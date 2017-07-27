package homework.from170701;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapGenome {

    private static int DATA_SIZE = 20;
    private static int WORD_LEN = 3;

    public static void main(String[] args) {
        byte[] data = DataGen.generate(DATA_SIZE);
        print(data);

        System.out.println(countDuplicates(data, WORD_LEN));

    }

    private static int countDuplicates(byte[] data, int wordLen) {
        HashMap<String, Integer> map = new HashMap<>();
        String currentWord;
        int counter = 0;

        for (int i = 0; i < DATA_SIZE - WORD_LEN + 1; i++) {
            currentWord = toString(Arrays.copyOfRange(data, i, i + WORD_LEN));
            if (!map.containsKey(currentWord)) {
                map.put(currentWord, 0);
            } else {
                map.put(currentWord, map.get(currentWord) + 1);
                System.out.print(i + " ");        //duplicates' positions print
            }
        }
        System.out.println();

        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            counter += entry.getValue();
        }
        return counter;
    }

    private static void print(byte[] arr) {
        for (byte b : arr) {
            System.out.print((char) b);
        }
        System.out.println();
    }

    private static String toString(byte[] arr) {
        String result = "";

        for (byte b : arr) {
            result += (char) b;
        }

        return result;
    }
}
