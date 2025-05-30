public class SalaryIncreaseVisitor implements Visitor {

    private final int percent;

    public SalaryIncreaseVisitor(int percent) {
        this.percent = percent;
    }

    @Override
    public void visit(Manager manager) {
        int increased = manager.getSalary() * (100 + percent) / 100;
        manager.setSalary(increased);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        int increased = salesPerson.getSalary() * (100 + percent) / 100;
        salesPerson.setSalary(increased);
    }

    @Override
    public void visit(SupportEngineer supportEngineer) {
        int increased = supportEngineer.getSalary() * (100 + percent) / 100;
        supportEngineer.setSalary(increased);
    }
}
