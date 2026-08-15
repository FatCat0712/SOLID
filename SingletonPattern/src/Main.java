public class Main {
    public static void main(String[] args) {
//        Runnable runnable = () -> Singleton.getInstance().sayHi();
        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBar());

        thread1.start();
        thread2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton.getInstance().sayHi();
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton.getInstance().sayHi();
        }
    }
}
