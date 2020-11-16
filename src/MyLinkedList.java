

public class MyLinkedList {
    private int size;
    private ListItem current;

    public MyLinkedList() {
        size = 1;
    }

    public void add(ListItem item) {
        if (this.current == null) {
            if (size > 1) {
                item.previous = this.current;
                this.current.next = item;
            }
            this.current = item;
            size++;
        } else if (current.compareTo(item) == 0) {
            System.out.println("Duplicate Item");
            return;
        } else if (current.compareTo(item) < 0) {
            current = current.next;
            add(item);
        } else if (current.compareTo(item) > 0) {
            this.current.previous = item;
            item.next = current;
            this.current = item;
            size++;
        }
    }

    public void remove(ListItem item) {
        if (current.compareTo(item) == 0) {
            current.goPrevious().next = item;
            item.next = current.next;
        }
    }
}
