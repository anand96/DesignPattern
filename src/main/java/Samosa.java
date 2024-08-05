//Samosa Khao Singleton jaan jao

// Ye wala Hai LAZY INITIALIZATION
public class Samosa {

    // Private to prevent is being used outside the class, also static cause it will be used in static getter
    private static Samosa samosa;


    //contrtuctor private so that it cannot be used.
    private Samosa(){

    }

    // isko static banna hai kuuki non-static ko pehle se bana hua object chaiye


    // Synchronized method
    public synchronized static Samosa getSamosa(){
            //synchronized block
            synchronized (Samosa.class){
                //object of this class
                if(samosa==null)
                {
                    samosa= new Samosa();
                }

            }
        return samosa;
    }
}


// 1. constructor  private

// 2.  object is created with help of method

// 3. create field to store object is private