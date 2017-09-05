package classwork.lesson170707;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListStuff {
    public static void main(String[] args) {
        AbstractList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("a");
        listOfStrings.add("s");
        listOfStrings.add("d");
        listOfStrings.add("f");
        listOfStrings.remove(0);
        listOfStrings.get(1);
        listOfStrings.size();
//        contains, indexOf & lastIndexOf, isEmpty, clear, remove, sort, toArray
    }
}
