package homework.from170701.genome;

import java.util.HashMap;

public class HashMapGenome {

    public static int countDuplicates(byte[] data, int wordLen) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String word = null;
        int result = 0;

        for (int i = 0; i < data.length - wordLen + 1; i++) {
            for (int j = 0; j < wordLen; j++) {
                sb.append((char)data[i + j]);
            }
            word = sb.toString();
            sb.delete(0, sb.capacity());

            if (!map.containsKey(word)) {
                map.put(word, 0);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }

        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            result += entry.getValue();
        }
        return result;
    }
}
