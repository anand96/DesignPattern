package AbsractFactory;

public class EmployeeFactory {
    // get EMployee
    public static Employee getEmployee(EmployeeAbstractFacroty facroty){
        return facroty.createEmployee();
    }
}
