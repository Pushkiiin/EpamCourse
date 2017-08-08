package homework.from170712;

import mytestframework.Asserts;

public class StackTest {
    public static void main(String[] args) {
        MyStringStack stack = new MyStringStack();
        stack.push("qwe");
        stack.push("asd");
        stack.push("zxc");
        System.out.println(Asserts.assertEquals(stack.peek(), "zxc"));
        stack.push("qaz");
        System.out.println(Asserts.assertEquals(stack.peek(), "qaz"));
        stack.push("wsx");
        System.out.println(Asserts.assertEquals(stack.peek(), "qaz"));
    }
}
