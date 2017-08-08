package homework.from170712;

public class MyStringStack {
    private static final int CAPACITY = 4;
    private final String[] elements = new String[CAPACITY];
    private int size = 0;

    public void add(String str) {
        elements[size++] = str;
    }

    public String peek() {
        return elements[size - 1];
    }
}
