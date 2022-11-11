import java.util.*;

public class Queue {
    PriorityQueue<Customer> queue = new PriorityQueue<>();

    public int getCusNumber(){
        return queue.size();
    }
    public void removeCus(Customer c){
        queue.remove(c);
    }

    private void payingCusGoes(){
        queue.poll();
    }

    public void cusArrives(Customer c){
        queue.add(c);
    }

    public Customer getNextCus(){
        payingCusGoes();
        return queue.peek();
    }
}
