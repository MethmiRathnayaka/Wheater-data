import java.util.ArrayList;

public class WheatherDataTester {
    public static void main(String[] args) throws InterruptedException {
        Node record1 = new Node(" ID#01-07FEB2020-07:52","GOOD");
        Node record2 = new Node(" ID#01-08MAR2020-07:52","BAD");
        Node record3 = new Node(" ID#01-07APR2020-07:52","GOOD");
        Node record4 = new Node(" ID#02-07FEB2020-07:52","GOOD");
        Node record5 = new Node(" ID#02-08MAR2020-07:52","BAD");
        Node record6 = new Node(" ID#02-07APR2020-07:52","GOOD");

        ThreadSafeLinkedList list1=new ThreadSafeLinkedList("List1");
        ArrayList recordlist1=new ArrayList();
        ArrayList recordlist2=new ArrayList();

        recordlist1.add(record1);
        recordlist1.add(record2);
        recordlist1.add(record3);
        recordlist2.add(record4);
        recordlist2.add(record5);
        recordlist2.add(record6);

        WeatherDivice divice1 = new WeatherDivice(list1,recordlist1);
        WeatherDivice divice2 = new WeatherDivice(list1,recordlist2);

        Thread thread1=new Thread(divice1);
        Thread thread2=new Thread(divice2);

        thread2.start();
        thread1.start();
        

    }
}
