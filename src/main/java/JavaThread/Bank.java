package JavaThread;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw_lock(50);
            }
        };
        Thread t1 = new Thread(task,"Thread1");
        Thread t2 = new Thread(task,"Thread2");
        t1.start();
        t2.start();
    }
}

// Expilict Locks
// Implicit use Synchronized

// disadvantages of using Synchronized
//1. Fairness
//2. Blocking
//3. Interruptibility
//4. Read/write locking