import java.util.ArrayList;

public class StaffList implements Employee {

    private final ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void applyVisitor(Visitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }

    @Override
    public int getSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    @Override
    public void accept(Visitor visitor) {
        applyVisitor(visitor);
    }
}
