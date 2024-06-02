import java.util.ArrayList;

public class WeatherDivice implements Runnable{
    private ThreadSafeLinkedList list;

    public ThreadSafeLinkedList getList() {
        return this.list;
    }

    public void setList(ThreadSafeLinkedList list) {
        this.list = list;
    }

    public ArrayList<Node> getRecords() {
        return this.records;
    }

    public void setRecords(ArrayList<Node> records) {
        this.records = records;
    }
    private ArrayList<Node> records;

    public WeatherDivice(ThreadSafeLinkedList list,ArrayList<Node> records){
        this.list = list;
        this.records = records;
    }

    @Override
    public void run() {
        for (Node node : records){
            //System.out.println(Thread.currentThread().getName() );
            try {
                list.add(node);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
    
}
