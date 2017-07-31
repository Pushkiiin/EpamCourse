package homework.from170701.genome;

import java.util.ArrayList;
import java.util.Collections;

public class SortGenome {

    public static int countDuplicates(byte[] data, int wordLen){
        ArrayList<String> words = new ArrayList<>(data.length);
        StringBuilder sb = new StringBuilder();
        int result = 0;

        for (int i = 0; i < data.length - wordLen + 1; i++) {
            for (int j = 0; j < wordLen; j++) {
                sb.append((char)data[i + j]);
            }
            words.add(sb.toString());
            sb.delete(0, sb.capacity());
        }
        Collections.sort(words);

        for (int i = 1; i < words.size(); i++) {
            if(words.get(i).equals(words.get(i - 1))){
                result++;
            }
        }
        return result;
    }
}
