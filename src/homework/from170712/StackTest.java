package homework.from170712;

import mytestframework.Asserts;

public class StackTest {
    public static void main(String[] args) {
        MyStringStack stack = new MyStringStack();
        stack.add("qwe");
        stack.add("asd");
        stack.add("zxc");
        Asserts.assertEquals(stack.peek(), "zxc");
    }
}
