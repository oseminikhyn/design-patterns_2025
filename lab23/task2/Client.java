import java.util.ArrayList;
import java.util.List;
public class Client {

    public static void main(String[] args) {
        List<MilitaryObject> militaryObjects = new ArrayList<>();
        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        System.out.println("== Initial State ==");
        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        System.out.println("\n== Secret Agent Operation ==");
        SpyVisitor secretAgent = new SecretAgent();
        for (MilitaryObject military : militaryObjects) {
            military.accept(secretAgent);
        }

        System.out.println("\n== State After Secret Agent ==");
        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        System.out.println("\n== Saboteur Operation ==");
        SpyVisitor saboteur = new Saboteur();
        for (MilitaryObject military : militaryObjects) {
            military.accept(saboteur);
        }

        System.out.println("\n== Final State After Sabotage ==");
        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
    }
}
