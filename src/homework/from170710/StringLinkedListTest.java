package homework.from170710;

public class StringLinkedListTest {
    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();
        System.out.println(list.toString());
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list.toString());
        System.out.println(list.remove(6));
        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
    }
}
