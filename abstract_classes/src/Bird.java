public class Bird extends Animal {
    @Override
    public void speak() {
        System.out.println("I am a bird: TWEET!");
    }

    @Override
    public void canFly() {
        System.out.println("I am a bird: I can fly :> WHEEEEEEE\n");
    }
}