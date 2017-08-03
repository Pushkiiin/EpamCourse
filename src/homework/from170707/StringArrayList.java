package homework.from170707;

import java.util.Arrays;

//create methods get, set, size, isEmpty, remove(value), toString (without trailing nulls)
public class StringArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    private String[] elements = new String[DEFAULT_CAPACITY];
    private int size = 0;

    public void add(String string) {

        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = string;
    }

    public boolean remove(int index) {
        if (index >= size || index < 0) {
            return false;
        }

        System.arraycopy(elements, index + 1, elements, index, --size - index);
        elements[size] = null;
        return true;
    }

    public boolean remove(String value) {
        for (int i = 0; i < elements.length; i++) {
            if (value.equals(elements[i])) {
                System.arraycopy(elements, i + 1, elements, i, --size - i);
                elements[size] = null;
                return true;
            }
        }
        return false;
    }

    public void set(int index, String newValue) {
        if (index >= 0 && index < size) {
            elements[index] = newValue;
        }
    }

    public String get(int index) {
        return (index >= 0 && index < size) ? elements[index] : null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(']');
        return sb.toString();
    }
}
