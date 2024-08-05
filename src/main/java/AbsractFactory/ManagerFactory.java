package AbsractFactory;

public class ManagerFactory extends EmployeeAbstractFacroty {
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
