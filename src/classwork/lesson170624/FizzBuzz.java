package classwork.lesson170624;

public class FizzBuzz {
    public static String fizzBuzz(int i) {
        String result = "";
        if (i % 3 == 0){
            return "Fizz";
        }
        if (i % 5 == 0){
            return "Buzz";
        }
        return "".equals(result) ? Integer.toString(i) : result;
    }
}
