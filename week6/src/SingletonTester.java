public class SingletonTester {
    public static void main(String[] args) {
        SingletonExample aSingleton = SingletonExample.getInstance();
        SingletonExample aSingletonOne = SingletonExample.getInstance();
    }
}
