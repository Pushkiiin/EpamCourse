package classwork.lesson170624;
//TDD style
public class FizzBuzzTest {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(SimpleUnit.assertEquals("", ""));

        System.out.println(SimpleUnit.assertEquals("", ""));

        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(3), "Fizz"));
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(6), "Fizz"));
        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(300), "Fizz"));
        System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(5), "Fizz"));

        System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(5), "Buzz"));
        System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(1), "Buzz"));
    }



}

