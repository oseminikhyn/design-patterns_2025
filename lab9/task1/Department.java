import java.util.ArrayList;
import java.util.List;

public class Department implements Payee {
    private final String name;
    private final Payee manager;
    private final List<Payee> employees = new ArrayList<>();

    public Department(String name, Payee manager) {
        this.name = name;
        this.manager = manager;
    }

    public void addEmployee(Payee employee) {
        employees.add(employee);
    }

    @Override
    public void payExpenses() {
        System.out.println("--- Paying department: " + name + " ---");
        manager.payExpenses();
        for (Payee employee : employees) {
            employee.payExpenses();
        }
    }
}