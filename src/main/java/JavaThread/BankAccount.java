package JavaThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    //Implicit Lock
    public synchronized void withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName()+ "attempting to withdraw "+ amount);
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+ "processing to withdraw "+ amount);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-= amount;
            System.out.println(Thread.currentThread().getName()+ "Completed withdrawal "+ balance);
        }
        else {
            System.out.println(Thread.currentThread().getName()+ "insufficient balance");
        }
    }

    private Lock lock = new ReentrantLock();

    public void withdraw_lock(int amount){
        System.out.println(Thread.currentThread().getName()+ "attempting to withdraw "+ amount);
        try {
            if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                if(balance>=amount)
                {
                    try{
                        System.out.println(Thread.currentThread().getName()+ "processing to withdraw "+ amount);
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        balance-= amount;
                        System.out.println(Thread.currentThread().getName()+ "Completed withdrawal "+ balance);
                    }
                    catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }
                else
                {
                    System.out.println(Thread.currentThread().getName()+ "insufficient balance");
                }
            }
            else {
                System.out.println(Thread.currentThread().getName()+"Could not acquire the lock,will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        if(Thread.currentThread().isInterrupted())
        {
            System.out.println("you can perform actions");
        }

    }


}
