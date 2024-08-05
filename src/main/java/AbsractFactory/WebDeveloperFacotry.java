package AbsractFactory;

public class WebDeveloperFacotry extends EmployeeAbstractFacroty{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
