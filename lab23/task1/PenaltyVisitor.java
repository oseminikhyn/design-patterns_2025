public class PenaltyVisitor implements Visitor {

    private final int penaltyAmount;

    public PenaltyVisitor(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary() - penaltyAmount);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(salesPerson.getSalary() - penaltyAmount);
    }

    @Override
    public void visit(SupportEngineer supportEngineer) {
        supportEngineer.setSalary(supportEngineer.getSalary() - penaltyAmount);
    }
}
