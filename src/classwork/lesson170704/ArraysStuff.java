package classwork.lesson170704;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysStuff {
    public static void main(String[] args) {
        //initialization
        int[] a = {};   //ok
        int[] b;
//        b = {};         //not ok
        b = new int[]{};
        b = new int[10];
        String[] s = new String[4];
        int[] r = {1, 2 ,3};
        System.out.println(Arrays.toString(r));
        ArrayList<String> lisOfStrings;

        print(s);
    }

    private static void print(String[] arraysOfStrings) {

    }


}
