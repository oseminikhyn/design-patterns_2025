import java.util.*;

public class BreadthFirstIterator implements Iterator<Item> {

    private final Queue<Component> queue = new LinkedList<>();
    private Item nextItem = null;

    public BreadthFirstIterator(Component root) {
        queue.add(root);
        advance();
    }

    private void advance() {
        nextItem = null;
        while (!queue.isEmpty()) {
            Component current = queue.poll();
            if (current instanceof Item) {
                nextItem = (Item) current;
                return;
            } else if (current instanceof Box) {
                queue.addAll(((Box) current).getComponents());
            }
        }
    }

    @Override
    public boolean hasNext() {
        return nextItem != null;
    }

    @Override
    public Item next() {
        Item result = nextItem;
        advance();
        return result;
    }
}