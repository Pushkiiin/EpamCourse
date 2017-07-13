package homework.from170701;

import java.util.Random;

public class DataGen {

    static final byte[]  ALPHABET = {'A', 'C', 'G', 'T'};

    public static byte[] generate(int size){
        byte data[] = new byte[size];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            int letterIndex = random.nextInt(ALPHABET.length);
            data[i] = ALPHABET[letterIndex];
        }

        return data;
    }
}
