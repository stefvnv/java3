public class Triangle extends Shape implements ShapeInterface{

    private String colour;

    public void draw() {
        System.out.println("drawing circle");
    }

    public void setColour(String t) {
        this.colour = t;
    }

    public String getColour (){
        return this.colour;
    }
}
