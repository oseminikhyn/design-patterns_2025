public class Employee implements Payee {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void payExpenses() {
        System.out.println(name + " has been paid $" + salary);
    }
}
