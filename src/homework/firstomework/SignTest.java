package homework.firstomework;

public class SignTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(0), 0));
        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(-1), -1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(1), 1));

        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(-10), -1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(10), 1));
        System.out.println(SimpleUnit.assertNotEquals(HWMethods.sign(0), 1));
        System.out.println(SimpleUnit.assertNotEquals(HWMethods.sign(0), -1));

        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(100500), 1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(-100500), -1));

        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(Integer.MAX_VALUE), 1));
        System.out.println(SimpleUnit.assertEquals(HWMethods.sign(Integer.MIN_VALUE), -1));
    }
}
