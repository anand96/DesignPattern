package FactoryDesign;

public class DeveloperClinet {
    public static void main(String[] args){
        //Employee employee = new AndroidDeveloper();
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary = employee.salary();
        System.out.println("Salary: "+salary);
    }
}
