public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("I am a dog: WOOF!");
    }

    @Override
    public void canFly() {
        System.out.println("I am a dog: I cannot fly :-(\n");
    }
}
