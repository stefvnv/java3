public class Car {
    private final int doors;
    private final String transmission;
    private final String body;

    public int getDoors() {
        return doors;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBody() {
        return body;
    }

    public Car(){
        this.doors = 0;
        this.transmission = null;
        this.body = null;
    }

    public Car(int doors, String transmission, String body) {
        this.doors = doors;
        this.transmission = transmission;
        this.body = body;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(5, "1.4L" , "hatchback");
        Car c3 = new Car(3, "3L" , "jeep");
        Car c4 = new Car();
        Car c5 = new Car(5, "2L" , "estate");

    }
}
