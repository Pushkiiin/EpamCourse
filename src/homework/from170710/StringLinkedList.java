package homework.from170710;

//the task is to make toString() use StringBuilder and realize remove(int index)
public class StringLinkedList {
    Node first;  // null
    Node last;  // null
    int size;  // 0

    public void add(String value) {
        Node node = new Node(value, null);

        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }

        last = node;

        size++;
    }

    public boolean remove(String value) {

        boolean result = false;
        Node current = first;
        Node prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (prev == null) {
                    first = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                result = true;
                break;
            }
            prev = current;
            current = current.next;
        }

        if (first == null) {
            last = null;
        }

        return result;
    }

    public String remove(int index) {
        if (index >= size || index < 0){
            return null;
        }
        if (index == 0){
            Node tmp = first;
            first = first.next;
            return tmp.value;
        }

        Node prev = first;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        Node deleted = prev.next;
        prev.next = prev.next.next;
        return deleted.value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        if (first != null) {
            sb.append(first.value);

            Node current = first.next;

            while (current != null) {
                sb.append(", ");
                sb.append(current.value);
                current = current.next;
            }
        }
        sb.append(']');

        return sb.toString();
    }
}