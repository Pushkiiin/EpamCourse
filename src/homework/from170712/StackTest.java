package homework.from170712;

import mytestframework.Asserts;

public class StackTest {
    public static void main(String[] args) {
        MyStringStack stack = new MyStringStack();
        stack.add("qwe");
        stack.add("asd");
        stack.add("zxc");
        System.out.println(Asserts.assertEquals(stack.peek(), "zxc"));
        stack.add("qaz");
        System.out.println(Asserts.assertEquals(stack.peek(), "qaz"));
        stack.add("wsx");
        System.out.println(Asserts.assertEquals(stack.peek(), "wsx"));
    }
}
