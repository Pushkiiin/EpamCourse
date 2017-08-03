package homework.from170707;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList list = new StringArrayList();
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        list.set(1, "dsa");
        list.set(4, "dsa");
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(2));
        list.remove(0);
        list.remove(5);
        list.remove("zxc");
        System.out.println(list.toString());

        list = new StringArrayList();
        System.out.println(list.isEmpty());
        list.set(1, "asd");
        System.out.println(list.size());
        System.out.println(list.toString());
    }
}
