package JavaThread;

public class LambdaExpression {
    public static void main(String[] args)
    {
        // Interface with single Abstract Method is called Functional Interface

        // Lamnda exprssio
        Thread t1 = new Thread(() -> System.out.println("Hello"))  ;
        t1.start();
    }
}

//Thread Communication
// Thread Safety
// Thread using Lambda



