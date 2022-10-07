public class Tester {
    public static void main(String[] args) {
        Shape c = new Circle();
        c.draw();

        Circle c2 = new Circle();
        c2.setColour("red");

        System.out.println(c2.getColour());

    }
}
