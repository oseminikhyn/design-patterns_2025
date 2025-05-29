public class ExpensesClient {
    public static void main(String[] args) {
        // Create director
        Payee director = new Employee("Mr. Smith (Director)", 5000);

        // Create department managers
        Payee meatManager = new Employee("John (Meat Manager)", 3000);
        Payee dairyManager = new Employee("Anna (Dairy Manager)", 3200);
        Payee sweetManager = new Employee("Lily (Sweets Manager)", 3100);

        // Create departments
        Department meatDept = new Department("Meat Department", meatManager);
        meatDept.addEmployee(new Employee("Mike", 1500));
        meatDept.addEmployee(new Employee("Sara", 1500));
        meatDept.addEmployee(new Employee("Tom", 1500));

        Department dairyDept = new Department("Dairy Department", dairyManager);
        dairyDept.addEmployee(new Employee("Nina", 1600));
        dairyDept.addEmployee(new Employee("Rob", 1600));
        dairyDept.addEmployee(new Employee("Kate", 1600));

        Department sweetDept = new Department("Sweets Department", sweetManager);
        sweetDept.addEmployee(new Employee("Alex", 1550));
        sweetDept.addEmployee(new Employee("Ben", 1550));
        sweetDept.addEmployee(new Employee("Eve", 1550));

        // Create supermarket
        Supermarket supermarket = new Supermarket("SuperStore", director);
        supermarket.addDepartment(meatDept);
        supermarket.addDepartment(dairyDept);
        supermarket.addDepartment(sweetDept);

        // Pay all expenses
        System.out.println("Paying all salaries:");
        supermarket.payExpenses();
    }
}