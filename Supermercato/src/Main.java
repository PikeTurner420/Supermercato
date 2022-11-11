public class Main {
    public static void main(String[] args) {
    Queue q = new Queue();
    Customer c1 = new Customer(1, "Natalina", "Froci",4);
    Customer c2 = new Customer(2, "Carlo", "Mario",5);
    Customer c3 = new Customer(3, "Strunz", "Mil",3);
    Customer c4 = new Customer(4, "Nicola", "Fis",1);
    Customer c5 = new Customer(5, "Gianni", "Ritz", 2);

    q.cusArrives(c1);
    q.cusArrives(c2);
    q.cusArrives(c3);
    q.cusArrives(c4);
    q.cusArrives(c5);

    System.out.println(q.queue);
    System.out.println(q.getNextCus());
    System.out.println(q.queue);
    System.out.println(q.getNextCus());
    System.out.println(q.queue);
    System.out.println(q.getNextCus());
    System.out.println(q.queue);
    System.out.println(q.getNextCus());
    System.out.println(q.queue);
    System.out.println(q.getNextCus());
    System.out.println(q.queue);
    }
}