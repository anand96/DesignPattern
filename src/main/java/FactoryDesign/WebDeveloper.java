package FactoryDesign;

public class WebDeveloper implements Employee {
    public int salary() {
        System.out.println("getting Web Developer Salary");
        return 40000;
    }
}
