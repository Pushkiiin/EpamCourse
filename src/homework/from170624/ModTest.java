package homework.from170624;

public class ModTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(1, 1), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(5, 1), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(5, 2), 1));

        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 1), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 2), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 3), 1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 51), 49));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(101, 51), 50));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 100), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(0, 1), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(0, 13), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(0, 100), 0));

        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 101), 100));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 100500), 100));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 100500), 100));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100500, 123345), 100500));

        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(Integer.MAX_VALUE, Integer.MAX_VALUE), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(Integer.MAX_VALUE, 1), 0));    //takes some time
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(0, Integer.MAX_VALUE), 0));

        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(0, 0), -1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(-2, 1), -1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(100, 0), -1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(Integer.MAX_VALUE, 0), -1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.mod(Integer.MIN_VALUE, 0), -1));
    }
}
