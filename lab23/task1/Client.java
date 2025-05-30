public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new SupportEngineer(45000));

        System.out.println("Original Total Salary: " + staffList.getSalary());

        // Increase salaries by 10%
        staffList.applyVisitor(new SalaryIncreaseVisitor(10));
        System.out.println("After 10% Increase: " + staffList.getSalary());

        // Apply penalty of 5000
        staffList.applyVisitor(new PenaltyVisitor(5000));
        System.out.println("After Penalty: " + staffList.getSalary());
    }
}
