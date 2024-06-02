public class Node {
    private String index;
    private Node next;
    private String record;

    public Node(String index, String record) {
        this.index=index;
        this.record=record;
    }

    public String getIndex() {
        return this.index;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getRecord() {
        return this.record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public void printNode(){
        System.out.println("Index: " + this.index+" Record: " + this.record);
    }
}
