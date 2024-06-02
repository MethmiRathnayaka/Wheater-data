public class ThreadSafeLinkedList extends LinkedList{
    public ThreadSafeLinkedList(String name) {
        super(name);
    }

    public synchronized void  add(Node node) throws InterruptedException {
        if (this.getLastNode() == null) {
            this.setLastNode(node);
            this.setFirstNode(node);
        }
        else{
            this.getLastNode().setNext(node);
            this.setLastNode(node);
            
        }
        System.out.println(Thread.currentThread().getName() + "is running");
        this.printList();
        System.out.println();
        Thread.currentThread().sleep(1000);
    }
}
