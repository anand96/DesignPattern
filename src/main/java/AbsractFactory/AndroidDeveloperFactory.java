package AbsractFactory;

public class AndroidDeveloperFactory extends EmployeeAbstractFacroty{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
