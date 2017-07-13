package homework.from170627;

import java.util.ArrayList;

public class Representations {

    public static final int BINARY_BASE = 2;
    public static final int OCTAL_BASE = 8;
    public static final int HEX_BASE = 16;

    public static String positiveIntToBinaryString(int decNum){

        if (decNum <= 0){
            return "0";
        }

        String binNumString = "";
        ArrayList<Integer> binNumList = new ArrayList<>();

        while (decNum > 0){
            binNumList.add(0, decNum % BINARY_BASE);
            decNum /= BINARY_BASE;
        }

        for (int i : binNumList) {
            binNumString += Integer.toString(i);
        }

        return binNumString;
    }

    public static String positiveIntToOctalString(int decNum){

        if(decNum <= 0){
            return "0";
        }

        String octalNumString = "";
        ArrayList<Integer> octalNumList = new ArrayList<>();

        while (decNum > 0){
            octalNumList.add(0, decNum % OCTAL_BASE);
            decNum /= OCTAL_BASE;
        }

        for (int i : octalNumList) {
            octalNumString += Integer.toString(i);
        }

        return octalNumString;
    }

    public static String positiveIntToHexString(int decNum){

        if (decNum <= 0){
            return "0";
        }

        String hexNumString = "";
        ArrayList<Character> charArray = new ArrayList<>();
        int remainder;

//          symbol              ASCII
//          char c1 = '0';        48
//          char c2 = '9';        57
//          char c3 = 'A';        65
//          char c4 = 'F';        70

        while (decNum > 0){
            remainder = decNum % HEX_BASE;
            if (remainder < 10){
                charArray.add(0, (char) (48 + remainder));
            } else {
                charArray.add(0, (char) (55 + remainder));
            }
            decNum /= HEX_BASE;
        }

        for (char c : charArray) {
            hexNumString += Character.toString(c);
        }

        return hexNumString;
    }

    public static String positiveIntToStringWithBase(int decNum, int base){

        if (decNum <= 0 || base < 2 || base > 36){          //only numbers and capital latin letters are allowed
            return "0";
        }

        String numWithNewBase = "";
        ArrayList<Character> charArray = new ArrayList<>();
        int remainder;

        while (decNum > 0){
            remainder = decNum % base;
            if (remainder < 10){
                charArray.add(0, (char) (48 + remainder));
            } else {
                charArray.add(0, (char) (55 + remainder));
            }
            decNum /= base;
        }

        for (char c : charArray) {
            numWithNewBase += Character.toString(c);
        }

        return numWithNewBase;
    }
}


//              symbol          ASCII

//          char c1 = '0';        48
//          char c2 = '9';        57
//          char c3 = 'A';        65
//          char c4 = 'F';        70
//          char c5 = 'Z';        90

