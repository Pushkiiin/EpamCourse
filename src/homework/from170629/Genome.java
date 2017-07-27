package homework.from170629;


// the task is to repeat duplicates search algorithm with iterations
// actually we made a huge mistake at class, so I'll write new one later probably

// the best idea I've come up with is to use HashMap, so there is just a repetition of our classwork realization (it's broken)

import java.util.Arrays;

public class Genome {


    public static final int DATA_SIZE = 10;
    public static final int WORD_LENGTH = 3;

    public static void main(String[] args) {
        byte[] data = DataGen.generate(DATA_SIZE);
        print(data);

        System.out.println(countDuplicates(data, WORD_LENGTH));

    }

    public static int countDuplicates(byte[] data, int wordLen){
        int counter = 0;

        for (int i = 0; i < data.length - wordLen; i++) {
            for (int j = i + 1; j < data.length - wordLen + 1; j++) {
                for (int k = 0; k < wordLen; k++) {
                    if (data[i + k] != data[j + k]){
                        break;
                    }
                    if (k == wordLen - 1){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public static void print(byte[] arr){
        for (byte b : arr) {
            System.out.print((char)b);
        }
        System.out.println();
    }
}
