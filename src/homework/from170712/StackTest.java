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
        System.out.println(Asserts.assertEquals(stack.size(), 4));
        System.out.println(Asserts.assertEquals(stack.pop(), "qaz"));
        System.out.println(Asserts.assertEquals(stack.size(), 3));
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();


        MyStringStack emptyStack = new MyStringStack();
//        System.out.println(Asserts.assertEquals(emptyStack.peek(), null));    this case can not be properly described with mytestframework, but we handled it
    }
}
