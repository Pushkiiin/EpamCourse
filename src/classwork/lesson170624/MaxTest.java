package classwork.lesson170624;

public class MaxTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MyMath.max(0, 1), 1));
        System.out.println(SimpleUnit.assertNotEquals(MyMath.max(0, 1), 0));
        System.out.println(SimpleUnit.assertEquals(MyMath.max(1, 0), 1));
        System.out.println(SimpleUnit.assertNotEquals(MyMath.max(1, 0), 0));

        System.out.println(SimpleUnit.assertEquals(MyMath.max(0, 10), 10));
        System.out.println(SimpleUnit.assertEquals(MyMath.max(10, 0), 10));
        System.out.println(SimpleUnit.assertNotEquals(MyMath.max(100500, 123), 123));
        System.out.println(SimpleUnit.assertNotEquals(MyMath.max(123, 100500), 123));

        System.out.println(SimpleUnit.assertNotEquals(MyMath.max(123, 100500), 123));
    }
}
