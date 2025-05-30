import java.util.*;

public class Shop implements Iterable<ShopItem> {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

    @Override
    public Iterator<ShopItem> iterator() {
        List<ShopItem> sorted = new ArrayList<>(items.values());
        sorted.sort(Comparator.comparing(ShopItem::getName));
        return sorted.iterator();
    }

    public Iterable<ShopItem> byQuantityDesc() {
        List<ShopItem> sorted = new ArrayList<>(items.values());
        sorted.sort((a, b) -> Integer.compare(b.getQuantity(), a.getQuantity()));
        return sorted;
    }
}