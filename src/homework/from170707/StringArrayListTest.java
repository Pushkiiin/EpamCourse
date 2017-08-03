package homework.from170707;

import mytestframework.Asserts;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList list = new StringArrayList();
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        System.out.println(Asserts.assertEquals(list.toString(), "[qwe, asd, zxc]"));
        list.set(1, "dsa");
        list.set(4, "dsa");
        System.out.println(Asserts.assertEquals(list.toString(), "[qwe, dsa, zxc]"));
        System.out.println(Asserts.assertEquals(list.get(2), "zxc"));
        list.remove(0);
        list.remove("zxc");
        System.out.println(Asserts.assertEquals(list.toString(), "[dsa]"));

        list = new StringArrayList();
        System.out.println(Asserts.assertEquals(list.isEmpty(), true));
        list.set(0, "asd");
        System.out.println(Asserts.assertEquals(list.toString(), "[]"));
    }
}
