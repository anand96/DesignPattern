package JavaThread;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=1;i<5;i++)
        {
            //System.out.println(Thread.currentThread().getName() +" - Priority: "+ Thread.currentThread().getPriority() +"-count :"+ i);
            try{
                Thread.sleep(100);
                System.out.println("Thread is running");

            }catch (InterruptedException e)
            {
                System.out.println("Thread is interrupted: " + e);

            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("low");
//        MyThread t2 = new MyThread("medium");
//        MyThread t3 = new MyThread("high");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.interrupt();
//        t2.start();
//        t3.start();
        //t1.join();// main thread will wait for t1
        //System.out.println("Hello");

    }
}


// Thread.yield give a chance to other thread as well.
// setDeeamon  Background thread