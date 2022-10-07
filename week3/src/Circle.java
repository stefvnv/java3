public class Circle extends Shape implements ShapeInterface{

    private String colour;

    public void draw() {
        System.out.println("drawing circle");
    }

    public void setColour(String c) {
        this.colour = c;
    }

    public String getColour (){
        return this.colour;
    }
}
