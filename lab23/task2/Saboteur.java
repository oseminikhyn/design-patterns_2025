public class Saboteur implements SpyVisitor {

    @Override
    public void visit(GeneralStaff generalStaff) {
        generalStaff.setSecretPaper(0);
        generalStaff.setGenerals(0);
        System.out.println("Saboteur: Destroyed all generals and secret papers at GeneralStaff!");
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        militaryBase.setOfficers(0);
        militaryBase.setSoldiers(0);
        militaryBase.setJeeps(0);
        militaryBase.setTanks(0);
        System.out.println("Saboteur: Destroyed all personnel and equipment at MilitaryBase!");
    }
}
