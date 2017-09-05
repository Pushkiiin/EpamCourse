package classwork.lesson170624;

public class MinTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MyMath.min(0, 1), 0));
        System.out.println(SimpleUnit.assertEquals(MyMath.min(1, 0), 0));
        System.out.println(SimpleUnit.assertNotEquals(MyMath.min(1, 0), 1));

        System.out.println(SimpleUnit.assertEquals(MyMath.min(10, 20), 10));
        System.out.println(SimpleUnit.assertEquals(MyMath.min(20, 10), 10));
        System.out.println(SimpleUnit.assertNotEquals(MyMath.min(20, 10), 20));

        System.out.println(SimpleUnit.assertEquals(MyMath.min(100500, -3), -3));
        System.out.println(SimpleUnit.assertEquals(MyMath.min(-3, 100500), -3));
        System.out.println(SimpleUnit.assertNotEquals(MyMath.min(100500, -3), 100500));

        System.out.println(SimpleUnit.assertEquals(MyMath.min(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));
        System.out.println(SimpleUnit.assertNotEquals(MyMath.min(0, Integer.MIN_VALUE), 0));
    }
}
