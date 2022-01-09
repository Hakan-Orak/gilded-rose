package Shop;

import entities.item.GenericItem;
import entities.item.Item;

import java.util.ArrayList;
import java.util.List;

public class InMemoryInventoryRepository implements InventoryRepository {

    private List<Item> items;

    public InMemoryInventoryRepository() {
        this.items = new ArrayList<>();
        this.items.add(new GenericItem("Pourfendeur Divin", 20, 20, 40));
    }

    @Override
    public List<Item> getInventory() {
        return items;
    }

    @Override
    public void saveInventory(List<Item> items) {
        this.items = items;
    }
}
