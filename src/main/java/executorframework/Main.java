package executorframework;

//Thread Pool

//1. Resource management
//2. Response time
//3. Control over Thread Count

//Reasons for Thread Management

//1. Manual Thread Management
//2. Resource Management
//3. Scalability
//4. Thread Reuse
//5. Error handling

// Executors Framework in Java : introduced in java 5 as a prt of java.util.concurrent package to simplify the development of concurrent applications by abstracting away many of the complexities involved in creating and managing threads.


//Interfaces
//
//1. Executor
//2. ExecutorService
//3. ScheduleExecutionService

// Difference between Runnable and Callable

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        Future<?> future = executorService1.submit(() -> System.out.println("Hello"));
        try {
            future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService1.shutdown();


        ExecutorService executorService = Executors.newFixedThreadPool(3 );
        for(int i=1;i<=10;i++)
        {
            int finalI = i;
            executorService.submit( () -> {
                long result = factorial(finalI);
            });
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static long factorial(int finalI) {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long res =1;
        for(int i=1;i<=finalI;i++)
        {
            res = res * i;
        }
        System.out.println(res);
        return res;
    }

}
