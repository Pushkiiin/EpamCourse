package homework.from170704;

import mytestframework.Asserts;

import java.util.ArrayList;
import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String s0 = null;
        String s1 = "";
        String s2 = "asd";
        String s3 = "qwe";
        String s4 = "zxc";

        ArrayList<String> test0 = new ArrayList<>(Arrays.asList(s0));
        ArrayList<String> test00 = null;
        ArrayList<String> test1 = new ArrayList<>(Arrays.asList(s1));

        ArrayList<String> test2 = new ArrayList<>(Arrays.asList(s2));
        ArrayList<String> test3 = new ArrayList<>(Arrays.asList(s2, s3, s4));

        System.out.println(Asserts.assertEquals(OneStringArray.arrToString(test0), "[null]"));
        System.out.println(Asserts.assertEquals(OneStringArray.arrToString(test00), "nullString"));
        System.out.println(Asserts.assertEquals(OneStringArray.arrToString(test1), "[]"));

        System.out.println(Asserts.assertEquals(OneStringArray.arrToString(test2), "[asd]"));
        System.out.println(Asserts.assertEquals(OneStringArray.arrToString(test3), "[asd, qwe, zxc]"));
    }

}
