package homework.from170704;

import java.util.ArrayList;

public class OneStringArray {

    public static String arrToString(ArrayList list){
        if (list == null){
            return "nullString";
        }

        String result = "[";
        for (int i = 0; i < list.size(); i++) {
            result += String.valueOf(list.get(i));
            if (i <  list.size() - 1){
                result += ", ";
            }
        }
        result += "]";

        return result;
    }
}
