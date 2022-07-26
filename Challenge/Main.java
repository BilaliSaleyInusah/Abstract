public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(null);
        list.traverse(list.getRoot());
       
        // String stringData = "Darwin Brisban Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "4 3 5 2 0 6 7 8 1 9";


        String[] data = stringData.split(" ");
        for (String string : data) {
            list.add(new Node(string));
        }

        list.traverse(list.getRoot());
        

        list.remove(new Node("8"));
        list.traverse(list.getRoot());
        list.remove(new Node("2"));
        list.remove(new Node("4"));
        list.remove(new Node("9"));
        list.traverse(list.getRoot());


    }
}