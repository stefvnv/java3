public class AnimalTester {
    public static void main(String[] args) {
        Animal doggy = new Dog();
        Animal kitty = new Cat();
        Animal birdy = new Bird();

        doggy.speak();
        doggy.canFly();

        kitty.speak();
        kitty.canFly();

        birdy.speak();
        birdy.canFly();
    }
}
