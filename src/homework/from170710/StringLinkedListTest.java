package homework.from170710;

import mytestframework.Asserts;

public class StringLinkedListTest {
    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();
        System.out.println(Asserts.assertEquals(list.toString(), "[]"));
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(Asserts.assertEquals(list.toString(), "[0, 1, 2, 3, 4, 5]"));
        System.out.println(Asserts.assertEquals(list.remove(3), "3"));
        System.out.println(Asserts.assertEquals(list.toString(), "[0, 1, 2, 4, 5]"));
        System.out.println(Asserts.assertEquals(list.remove(0), "0"));
        System.out.println(Asserts.assertEquals(list.toString(), "[1, 2, 4, 5]"));
    }
}
