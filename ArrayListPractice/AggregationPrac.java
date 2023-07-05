package ArrayListPractice;

public class AggregationPrac {
    int id;
    String name;
    Address address;

    public AggregationPrac(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("indore", "MP", "india");
        Address address2 = new Address("Maheshwar", "MP", "india");

        AggregationPrac aggregationPrac = new AggregationPrac(101, "Ritika", address1);
        AggregationPrac aggregationPrac2 = new AggregationPrac(102, "Vaishnavi", address2);

        aggregationPrac.display();
        aggregationPrac2.display();
    }

}

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;

    }
}
