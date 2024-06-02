public class LinkedList {
    private String name;
    private Node firstNode = null;
    private Node LastNode = null;

    public LinkedList(String name) {
        this.name = name;
    }
    public Node getFirstNode() {
        return firstNode;
        
    }
    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
        
    }
    public Node getLastNode() {
        return LastNode;
        
    }
    public void setLastNode(Node lastNode) {
        LastNode = lastNode;
        
    }
    public void add(Node node) throws InterruptedException {
        if (this.getLastNode() == null) {
            this.setLastNode(node);
            this.setFirstNode(node);
        }
        else{
            this.getLastNode().setNext(node);
            this.setLastNode(node);
            ;
        }
    }
    public void printList(Node node) {
        node.printNode();
        if (node==getLastNode()){
            return;
        }
        printList(node.getNext());
    }
    public void printList() {
        printList(this.getFirstNode());
    }
}
