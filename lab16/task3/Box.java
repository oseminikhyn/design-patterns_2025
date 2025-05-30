import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

    private final int id;
    private final List<Component> components = new ArrayList<>();

    public Box(int id) {
        this.id = id;
    }

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void execute() {
        System.out.println("Box: " + id);
        for (Component component : components) {
            component.execute();
        }
    }
}