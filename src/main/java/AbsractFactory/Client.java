package AbsractFactory;

public class Client {
    public static void main(String[] args)
    {
       Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
       String name = e1.name();
       System.out.println(name);

       Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFacotry());
       e2.name();


       Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
       e3.name();
    }
}
