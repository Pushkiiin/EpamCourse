package classwork.lesson170629.practice;

import java.util.Random;

public class DataGen {
    static final byte[]  ALPHABET = {'A', 'C', 'G', 'T'};
    public static byte[] generate(int size){
        //fill winh rng
        //secureRandom - более медленный, но рандомнее, чем Random
        byte data[] = new byte[size];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            int letterIndex = random.nextInt(ALPHABET.length);
            data[i] = ALPHABET[letterIndex];
        }

        return data;
    }
}
