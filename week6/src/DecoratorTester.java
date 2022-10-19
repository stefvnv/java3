public class DecoratorTester {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Normal Cirlce");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nRED decorated Circle");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRED decorated Rectangle");
        redRectangle.draw();

        Shape blueCircle = new BlueShapeDecorator(new Circle());
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

        System.out.println("\nCircle with blue border");
        blueCircle.draw();

        System.out.println("\nRectangle with blue border");
        blueRectangle.draw();
    }
}
