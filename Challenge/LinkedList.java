public class LinkedList implements NodeList {

    private LinkItem root = null;

    public LinkedList (LinkItem root){
        this.root = root;
    }

    @Override
    public LinkItem getRoot() {
        return this.root;
    }

    @Override
    public boolean add(LinkItem item) {
        if (this.root == null) {
            //this list is empty so this item become the head
            this.root = item;
            return true;
        }

        LinkItem currentItem = this.root;
        while (currentItem != null) {
            int comparision  = currentItem.compareTo(item);
            if (comparision < 0) {
                // the newItem is greater so it have to move right if possible 
                // meaning the old item have to come befor the new item
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                }else{
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (comparision > 0){
                // the newItem is lesser so it have to move left if possible 
                // meaning the newitem item have to come befor the old item
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                }else {
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item; 
                }
                return true;
            } else{
                // they are equal so we will not add it 
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean remove(LinkItem item) {
        if (item != null) {
                System.out.println("Deleting item " + item.getValue());
        }
        LinkItem currentItem = this.root;
        while (currentItem != null){

            int comparison = currentItem.compareTo(item);
            if (comparison == 0 ) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null ) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if (comparison < 0) {
                currentItem = currentItem.next();
            }else {
                //comparison is > 0
                // we are at an item greater then the one to be delected 
                // so the item is not in the list
                return false;
            }
        }
        // we have reached the end of the list 
        // without finding the item to delete
        return false;
    }

    @Override
    public void traverse(LinkItem item) {
        if (item == null) {
            System.out.println("The list is empty");
        }else {
            while (item != null) {
                System.out.println(item.getValue());
                item = item.next();
            }
        }
    
    }
    
}
