package AbsractFactory;

public class WebDeveloper implements Employee{
    public int salary(){
        return 5000;
    }
    public String name()
    {
        System.out.println("I am WEB Developer");
        return "WEB DEVELOPER";
    }
}
