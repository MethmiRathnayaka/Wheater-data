public class WheatherDataTester {
    public static void main(String[] args) {
        Node record1 = new Node("07FEB2020-07:52","GOOD");
        Node record2 = new Node("08MAR2020-07:52","BAD");
        Node record3 = new Node("07APR2020-07:52","GOOD");

        LinkedList list1=new LinkedList("List1");
        list1.add(record1);
        list1.add(record2);
        list1.add(record3);

        list1.printList();

    }
}
