import java.util.ArrayList;
import java.util.List;

public class Supermarket implements Payee {
    private final String name;
    private final Payee director;
    private final List<Payee> departments = new ArrayList<>();

    public Supermarket(String name, Payee director) {
        this.name = name;
        this.director = director;
    }

    public void addDepartment(Payee department) {
        departments.add(department);
    }

    @Override
    public void payExpenses() {
        System.out.println("=== Supermarket: " + name + " ===");
        director.payExpenses();
        for (Payee dept : departments) {
            dept.payExpenses();
        }
    }
}