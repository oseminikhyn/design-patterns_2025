public class SecretAgent implements SpyVisitor {

    @Override
    public void visit(GeneralStaff generalStaff) {
        int stolen = generalStaff.getSecretPaper();
        generalStaff.setSecretPaper(0);
        System.out.println("SecretAgent: Stole " + stolen + " secret papers from GeneralStaff.");
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        System.out.println("SecretAgent: Observing MilitaryBase. No action taken.");
    }
}
