public abstract class LinkItem{
    protected LinkItem rightLink = null;
    protected LinkItem leftlink = null;

    protected Object value;

    public LinkItem(Object value){
        this.value = value;
    }

    abstract LinkItem next();
    abstract LinkItem setNext(LinkItem item);
    abstract LinkItem previous();
    abstract LinkItem setPrevious(LinkItem item);

    abstract int compareTo(LinkItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}