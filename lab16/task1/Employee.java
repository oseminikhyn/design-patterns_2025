public class Employee implements Comparable<Employee> {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareToIgnoreCase(other.name);
    }
}