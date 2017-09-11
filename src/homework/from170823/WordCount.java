package homework.from170823;

import java.util.*;

//string list into map(string : int); loop vs lambda
public class WordCount {

    private static final int strLength = 20;

    //actual code
    public static void main(String[] args) {
        List<String> strList = StrListGenerator.generate(strLength);
        System.out.println(strList);

        //loop solution
        Map<String, Integer> loopMap = new HashMap<>();
        for (String str : strList) {
            loopMap.put(str, loopMap.containsKey(str) ? loopMap.get(str) + 1 : 1);
        }
        System.out.println(loopMap);

        //lambda solution
        Map<String, Integer> lambdaMap = new HashMap<>();
        strList.forEach(s -> lambdaMap.put(s, lambdaMap.containsKey(s) ? lambdaMap.get(s) + 1 : 1));
        System.out.println(lambdaMap);
    }


    //helper class
    static class StrListGenerator{


        public static List<String> generate(int size){
            List<String> strList = new ArrayList<>();
            Random rnd = new Random();
            String[] values = {"one", "two", "three", "four", "five", "many"};

            for (int i = 0; i < size; i++) {
                strList.add(values[rnd.nextInt(6)]);
            }
            return strList;
        }
    }
}
