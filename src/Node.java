public class Node extends ListItem {
    public Node(String value) {
        super(value);
    }

    @Override
    protected ListItem setNext(ListItem next) {
        if (this.hasNext()) {
            ListItem tmp = this.next;
            this.next = next;
            next.next = tmp;
            return next;
        }
        this.next = next;
        return next;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        if (this.hasPrevious()) {
            ListItem tmp = this.previous;
            this.previous = previous;
            previous.previous = tmp;
            return this;
        }
        this.previous = previous;
        return this;
    }

    @Override
    ListItem goNext() {
        if (this.hasNext()) {
            return this.next;
        }
        System.out.println("Nothing after this.");
        return this;
    }

    @Override
    ListItem goPrevious() {
        if (this.hasPrevious()) {
            return this.previous;
        }
        System.out.println("Nothing before this.");
        return this;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
