import java.util.Random;

public class Singleton {
    private final int index;
    private static volatile Singleton uniqueInstance;

    private Singleton(int index) {
        this.index = index;
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    Random random = new Random();
                    int index = random.nextInt(1, 10);
                    uniqueInstance = new Singleton(index);
                }
            }
        }
        return uniqueInstance;
    }

    public void sayHi() {
        System.out.println("Hello everyone, I am number " + this.index);
    }

}
