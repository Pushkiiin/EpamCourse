package homework.from170707;

import mytestframework.Asserts;

//the task is to realize methods trim and replace for string
public class StringMethodsPractice {

    public static void main(String[] args) {

        System.out.println(Asserts.assertEquals(trim(""), ""));
        System.out.println(Asserts.assertEquals(trim("Hello"), "Hello"));
        System.out.println(Asserts.assertEquals(trim("   Hello "), "Hello"));
        System.out.println(Asserts.assertEquals(trim("  Hello"), "Hello"));
        System.out.println(Asserts.assertEquals(trim("Hello  "), "Hello"));
        System.out.println(Asserts.assertEquals(trim("  He l l o  "), "He l l o"));

        System.out.println(Asserts.assertEquals(replace("", 'l', 'f'), ""));
        System.out.println(Asserts.assertEquals(replace("Hello", 'i', 'D'), "Hello"));
        System.out.println(Asserts.assertEquals(replace("Hello", 'l', 'f'), "Heflo"));
        System.out.println(Asserts.assertEquals(replace("Hello", 'o', 'p'), "Hellp"));
        System.out.println(Asserts.assertEquals(replace("Hello", 'e', ' '), "H llo"));
        System.out.println(Asserts.assertEquals(replace("Hello", 'H', ' '), " ello"));


    }

    private static String trim(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        int first, last;
        for (first = 0; first < str.length(); first++) {
            if(str.charAt(first) != ' '){
                break;
            }
        }
        for (last = str.length() - 1; last >= 0; last--) {
            if(str.charAt(last) != ' '){
                break;
            }
        }

        return first < last ? str.substring(first, last + 1) : "";
    }

    private static String replace(String str, char oldChar, char newChar){
        char[] chars = str.toCharArray();
        int index = -1;

        //find the first position of oldChar in array
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == oldChar){
                index = i;
            }
        }

        if (index == -1){
            return str;
        } else{
            chars[index] = newChar;
            return String.valueOf(chars);
        }
    }

}