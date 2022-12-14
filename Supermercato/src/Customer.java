import java.util.Comparator;
import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private String  name, surname;
    private int id, age;

    public Customer(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.age + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Customer o) {
        return Comparator.comparing(Customer::getAge).reversed()
                .thenComparing(Customer::getId).compare(this, o);
    }
}
