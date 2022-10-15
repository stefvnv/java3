/**
 * Assignment 1 - Graphical User Interface Design
 * Part 3 - House
 * Stefana Chiritescu
 * A00282343
 */

public class House {

    //instance variables
    private int noBedrooms;
    private int noBathrooms;
    private String ownerSurname;


    //constructors
    public House(){
        this.noBedrooms = 0;
        this.noBathrooms = 0;
        this.ownerSurname = "";
    }

    public House(int bedrooms, int bathrooms, String surname){
        this.noBedrooms = bedrooms;
        this.noBathrooms = bathrooms;
        this.ownerSurname = surname;
    }


    //getters and setters
    public int getNoBedrooms() {
        return noBedrooms;
    }

    public void setNoBedrooms(int noBedrooms) {
        this.noBedrooms = noBedrooms;
    }

    public int getNoBathrooms() {
        return noBathrooms;
    }

    public void setNoBathrooms(int noBathrooms) {
        this.noBathrooms = noBathrooms;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    //prints all details
    public void printDetails(){
        System.out.println("Owners: " + ownerSurname +
                " Number of bedrooms: " + noBedrooms +
                " Number of bathrooms: " + noBathrooms);
    }

    public static void main(String[] args) {

        //house objects - non-empty constructor
        House house1 = new House(5,1, "Smith");
        House house2 = new House(3,1, "Jones");

        //house object - empty constructor
        House house3 = new House();

        //filling details of empty house object using sets
        house3.setNoBedrooms(4);
        house3.setNoBathrooms(2);
        house3.setOwnerSurname("Burke");

        //printing the details using printDetails method
        house1.printDetails();
        house2.printDetails();
        house3.printDetails();
    }
}
