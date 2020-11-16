

public abstract class ListItem  {
    protected ListItem next = null;
    protected ListItem previous = null;

    protected Object value;

    abstract ListItem setNext(ListItem next);
    abstract ListItem setPrevious(ListItem previous);

    protected ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem goNext();
    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    abstract ListItem goPrevious();
    public boolean hasPrevious() {
        if (this.previous != null) {
            return true;
        }
        return false;
    }

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
