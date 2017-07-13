package homework.from170624;

public class IsPrimeTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(2), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(3), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(4), true));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(5), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(6), true));

        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(100500), true));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(100501), false));

        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(Integer.MAX_VALUE), true)); //takes some time

        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(0), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(1), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(-1), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(-100500), false));
        System.out.println(SimpleUnit.assertEquals(HWMethods.isPrime(Integer.MIN_VALUE), false));
    }
}
