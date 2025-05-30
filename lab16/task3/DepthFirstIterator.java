import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class DepthFirstIterator implements Iterator<Item> {

    private final Stack<Iterator<Component>> stack = new Stack<>();
    private Item nextItem = null;

    public DepthFirstIterator(Component root) {
        List<Component> start = new ArrayList<>();
        start.add(root);
        stack.push(start.iterator());
        advance();
    }

    private void advance() {
        nextItem = null;
        while (!stack.isEmpty()) {
            Iterator<Component> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                continue;
            }
            Component current = iterator.next();
            if (current instanceof Item) {
                nextItem = (Item) current;
                return;
            } else if (current instanceof Box) {
                stack.push(((Box) current).getComponents().iterator());
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
