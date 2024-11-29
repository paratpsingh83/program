package ArrayDemo;

class A {
    public synchronized void m1() {
        try {
            Thread.sleep(5000); // Simulates some work with a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SynchronizedTest {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();

        Thread thread1 = new Thread(() -> obj1.m1());
        Thread thread2 = new Thread(() -> obj2.m1());

        thread1.start();
        thread2.start();
    }
}
