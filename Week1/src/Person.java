public class Person {
    private String name;
    private long phoneNumber;
    private String address;

    public Person(){
        this.name = null;
        this.phoneNumber = 0;
        this.address = null;
    }

    public Person (String name){
        this.name = name;
    }

    public Person (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person (String name, long phone) {
        this.name = name;
        this.phoneNumber = phone;
    }

    public Person (String name, long phone, String address) {
        this.name = name;
        this.phoneNumber = phone;
        this.address = address;
    }

    Person p1 = new Person();
    Person p2 = new Person("Stefana");
    Person p3 = new Person ("Mary", "Cork");
    Person p4 = new Person("Claire", 94324843);
    Person p5 = new Person("Sierra", 99999999, "Athlone");
}
