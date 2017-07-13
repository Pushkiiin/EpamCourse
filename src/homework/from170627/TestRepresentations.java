package homework.from170627;

import mytestframework.Asserts;

public class TestRepresentations {
    public static void main(String[] args) {

//                          binary tests
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(0), "0"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(1), "1"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(2), "10"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(3), "11"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(10), "1010"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(16), "10000"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(1024), "10000000000"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(Integer.MAX_VALUE), "1111111111111111111111111111111"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToBinaryString(Integer.MAX_VALUE + 1), "0"));
//
//                          octal tests
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(0), "0"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(1), "1"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(7), "7"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(8), "10"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(10), "12"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(20), "24"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(1024), "2000"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(Integer.MAX_VALUE), "17777777777"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToOctalString(Integer.MAX_VALUE + 1), "0"));

//                          hex tests
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(0), "0"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(1), "1"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(10), "A"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(15), "F"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(16), "10"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(31), "1F"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(32), "20"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(1024), "400"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(Integer.MAX_VALUE), "7FFFFFFF"));
//        System.out.println(Asserts.assertEquals(Representations.positiveIntToHexString(Integer.MAX_VALUE + 1), "0"));

//                          given base tests
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(0, 2), "0"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(2, 0), "0"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(1, 2), "1"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(16, 2), "10000"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(27, 3), "1000"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(16, 16), "10"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(35, 36), "Z"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(36, 36), "10"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(Integer.MAX_VALUE, 8), "17777777777"));
        System.out.println(Asserts.assertEquals(Representations.positiveIntToStringWithBase(Integer.MAX_VALUE + 1, 24), "0"));

    }
}

