package homework.from170624;

public class IsFibonacciTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(1), true));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(2), true));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(3), true));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(4), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(5), true));

        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(6765), true));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(10000), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(10946), true));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(10950), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(20000), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(1836311903), true));

        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(0), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(-1), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(Integer.MAX_VALUE), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isFibonacci(Integer.MIN_VALUE), false));
    }
}
