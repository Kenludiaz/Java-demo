

public abstract class ListItem  {
    private ListItem next;
    private ListItem previous;
    private String value;

    public void setNext(ListItem next) {
        this.next = next;
        next.previous = this;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
        previous.next = this;
    }

    public ListItem(String value) {
        this.value = value;
    }

    public void goNext() {
        if (!this.hasNext()) {
            System.out.println("No value next to it.");
            return;
        }
        this = next;
    }

    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }
}
