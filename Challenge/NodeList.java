public interface NodeList {
    LinkItem getRoot();
    boolean add(LinkItem item);
    boolean remove(LinkItem item);
    void traverse(LinkItem item);
}
