public class LinkedList {
    private String name;
    private Node firstNode = null;
    private Node LastNode = null;

    public LinkedList(String name) {
        this.name = name;
    }
    public void add(Node node) {
        if (this.LastNode == null) {
            this.LastNode = node;
            this.firstNode = node;
        }
        else{
            this.LastNode.setNext(node);
            this.LastNode=node;
            ;
        }
    }
    public void printList(Node node) {
        node.printNode();
        if (node==LastNode){
            return;
        }
        printList(node.getNext());
    }
    public void printList() {
        printList(this.firstNode);
    }
}
