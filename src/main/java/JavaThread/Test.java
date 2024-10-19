package JavaThread;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        CounterThread counterThread1 = new CounterThread(counter);

        counterThread.start();
        counterThread1.start();

        try {
            counterThread.join();
            counterThread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount()  );


    }
}
