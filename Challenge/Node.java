public class Node extends LinkItem {

    public Node(Object value) {
        super(value);
        //TODO Auto-generated constructor stub
    }

    @Override
    LinkItem next() {
        return this.rightLink;
    }

    @Override
    LinkItem setNext(LinkItem item) {
        this.rightLink = item;
        return rightLink;
    }

    @Override
    LinkItem previous() {
        return leftlink;
    }

    @Override
    LinkItem setPrevious(LinkItem item) {
        this.leftlink = item;
        return this.leftlink;
    }

    @Override
    int compareTo(LinkItem item) {
        if (item != null ) {
            return ( ( (String) super.getValue() ).compareTo( ((String) item.getValue()) ));
        }
        return -1;
    }
    
}
