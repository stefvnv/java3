public class Customer {
    private String name;
    private String address;
    private long number;
    private String plan;


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    //constructor 1
    public Customer(long number){
        this.number = number;
    }

    //constructor 2
    public Customer(String name, String address, long number, String plan) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.plan = plan;
    }

    //constructor 3
    public Customer(String name, long number){
        this.name = name;
        this.number = number;
    }

    //constructor 4
    public Customer(long number, String plan){
        this.number = number;
        this.plan = plan;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", plan='" + plan + '\'' +
                '}';
    }

    public void printDetails(){
        System.out.println(toString());
    }

    public static void main(String[] args) {

        //create customers
        Customer c1 = new Customer(987999999);
        Customer c2 = new Customer("Martina Curran", "AIT, Athlone", 999999999, "billpay");
        Customer c3 = new Customer("Sierra the Dog", 989898989);
        Customer c4 = new Customer(444444444, "prepay");

        //printing using printDetails method
        c1.printDetails();
        c2.printDetails();

        //printing using getters
        System.out.println(c3.getName() + c3.address + c3.number + c3.plan);
        System.out.println(c4.getName() + c4.address + c4.number + c4.plan);
    }
}
