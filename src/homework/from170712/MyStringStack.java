package homework.from170712;

public class MyStringStack {
    private static final int CAPACITY = 4;
    private final String[] elements = new String[CAPACITY];
    private int size = 0;

    public void push(String str) {
        if(size >= CAPACITY){
            return;
        }
        elements[size++] = str;
    }

    public String peek() {
        return size == 0 ? null : elements[size - 1];
    }

    public int size() {
        return size;
    }

    public String pop() {
        return elements[size - 1];
    }
}
