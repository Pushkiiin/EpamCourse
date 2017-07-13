package homework.from170704;

import java.util.ArrayList;

public class OneStringArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
//        al.add("asd");
//        al.add("123");
        System.out.println(arrToString(al));
    }

    public static String arrToString(ArrayList list){

        String result = "[";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).toString();
            if (i <  list.size() - 1){
                result += ", ";
            }
        }
        result += "]";

        return result;
    }
}
