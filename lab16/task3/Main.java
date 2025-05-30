import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {
                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        System.out.println("-- DFS --");
        Item minItem = null, maxItem = null;
        DepthFirstIterator dfs = new DepthFirstIterator(root);
        while (dfs.hasNext()) {
            Item item = dfs.next();
            System.out.println(item);
            if (minItem == null || item.getValue() < minItem.getValue()) {
                minItem = item;
            }
            if (maxItem == null || item.getValue() > maxItem.getValue()) {
                maxItem = item;
            }
        }

        System.out.println("\nMin item: " + minItem);
        System.out.println("Max item: " + maxItem);

        System.out.println("\n-- BFS --");
        BreadthFirstIterator bfs = new BreadthFirstIterator(root);
        while (bfs.hasNext()) {
            System.out.println(bfs.next());
        }
    }
}
